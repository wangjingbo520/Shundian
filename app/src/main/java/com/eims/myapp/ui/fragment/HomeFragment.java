package com.eims.myapp.ui.fragment;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.eims.myapp.R;
import com.eims.myapp.adapter.viewadapter.FindViewpagerAdapter;
import com.eims.myapp.common.utils.ToastUtil;
import com.eims.myapp.common.widgets.dialog.TablayoutDialog;
import com.eims.myapp.common.zxing.ScannerActivity;
import com.eims.myapp.common.zxing.common.Scanner;
import com.eims.myapp.ui.activity.SearchActivity;
import com.eims.myapp.ui.fragment.childfragment.ChildFragment;

import java.lang.reflect.Field;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * @author bobo
 * @date 2018/9/1
 * describe 首页
 */
public class HomeFragment extends Fragment {
    @BindView(R.id.tl_tab)
    TabLayout tlTab;
    @BindView(R.id.vp_content)
    ViewPager vpContent;
    @BindView(R.id.etSearchs)
    EditText etSearch;
    private Unbinder mUnBinder;
    private FragmentManager fragmentManager;

    private ArrayList<Fragment> mFragments;
    private String[] mTitles;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
            Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        mUnBinder = ButterKnife.bind(this, view);
        init();
        return view;
    }

    public void init() {
//        etSearch.setInputType(InputType.TYPE_NULL);
//        etSearch.setInputType(InputType.TYPE_NULL);
        fragmentManager = getChildFragmentManager();
        mFragments = new ArrayList<>();
        mTitles = getResources().getStringArray(R.array.tab_home);
        mFragments.add(new ChildFragment());
        mFragments.add(new ChildFragment());
        mFragments.add(new ChildFragment());
        mFragments.add(new ChildFragment());
        mFragments.add(new ChildFragment());
        vpContent.setOffscreenPageLimit(3);
        vpContent.setAdapter(new FindViewpagerAdapter(fragmentManager, mTitles,
                mFragments));
        tlTab.setupWithViewPager(vpContent);
        setIndicator(tlTab);
    }

    private void setIndicator(TabLayout tabs) {
        Class<?> tabLayout = tabs.getClass();
        Field tabStrip = null;
        try {
            tabStrip = tabLayout.getDeclaredField("mTabStrip");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        assert tabStrip != null;
        tabStrip.setAccessible(true);
        LinearLayout ll_tab = null;
        try {
            ll_tab = (LinearLayout) tabStrip.get(tabs);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        int left = (int) (getResources().getDisplayMetrics().density * 10);
        int right = (int) (getResources().getDisplayMetrics().density * 10);
        assert ll_tab != null;
        for (int i = 0; i < ll_tab.getChildCount(); i++) {
            View child = ll_tab.getChildAt(i);
            child.setPadding(0, 0, 0, 0);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(0, LinearLayout
                    .LayoutParams.MATCH_PARENT, 1);
            params.leftMargin = left;
            params.rightMargin = right;
            child.setLayoutParams(params);
            child.invalidate();
        }
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mUnBinder.unbind();
    }

    @OnClick({R.id.iv_edit_fragment, R.id.etSearchs, R.id.ivSaomiao})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.etSearchs:
                startActivity(new Intent(getActivity(), SearchActivity.class));
                break;
            case R.id.ivSaomiao:
                //扫描
                ScannerActivity.gotoActivity(getActivity(),
                        true, ScannerActivity.EXTRA_LASER_LINE_MODE_0, ScannerActivity
                                .EXTRA_SCAN_MODE_0, false
                        , false, false);

            default:
                break;
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != Activity.RESULT_CANCELED && resultCode == Activity.RESULT_OK) {
            if (requestCode == ScannerActivity.REQUEST_CODE_SCANNER) {
                if (data != null) {
                    String stringExtra = data.getStringExtra(Scanner.Scan.RESULT);
                    ToastUtil.showMessage(stringExtra);
                    //     tvResult.setText(stringExtra);
                }
            } else if (requestCode == 1) {
                // Data field is content://contacts/people/984
                //   showContactAsBarcode(data.getData());
            }
        }
    }

}
