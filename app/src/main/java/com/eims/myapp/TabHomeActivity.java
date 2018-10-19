package com.eims.myapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.eims.myapp.base.MyNetDataBaseActivity;
import com.eims.myapp.common.view.TabView;
import com.eims.myapp.ui.fragment.ClassificationFragment;
import com.eims.myapp.ui.fragment.HomeFragment;
import com.eims.myapp.ui.fragment.MessageFragment;
import com.eims.myapp.ui.fragment.MyFragment;
import com.eims.myapp.ui.fragment.ShoppingCartFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * @author bobo
 * @date 2018/9/1
 * describe 主页
 */
public class TabHomeActivity extends MyNetDataBaseActivity {
    @BindView(R.id.iv1)
    ImageView iv1;
    @BindView(R.id.tv1)
    TextView tv1;
    @BindView(R.id.iv2)
    ImageView iv2;
    @BindView(R.id.tv2)
    TextView tv2;
    @BindView(R.id.iv3)
    ImageView iv3;
    @BindView(R.id.tv3)
    TextView tv3;
    @BindView(R.id.iv4)
    ImageView iv4;
    @BindView(R.id.tv4)
    TextView tv4;
    @BindView(R.id.iv5)
    ImageView iv5;
    @BindView(R.id.tv5)
    TextView tv5;

    /**
     * 首页
     **/
    private TabView tab1;

    /**
     * 分类
     **/
    private TabView tab2;

    /**
     * 消息
     **/
    private TabView tab3;

    /**
     * 购物车
     **/
    private TabView tab4;

    /**
     * 我的
     **/
    private TabView tab5;

    private List<TabView> tabs;
    private long mExitTime;
    private TabView curTab;

    private HomeFragment homeFragment;
    private ClassificationFragment classificationFragment;
    private MessageFragment messageFragment;
    private ShoppingCartFragment shoppingCartFragment;
    private MyFragment myFragment;
    private List<Fragment> fragmentList = new ArrayList<>();
    private static final String HOME_FRAGMENT_KEY = "homeFragment";
    private static final String DASHBOARD_FRAGMENT_KEY = "DashboardFragment";
    private static final String NOTICE_FRAGMENT_KEY = "NoticeFragment";
    private static final String SHOPCAR_KEY = "ShopCarFragment";
    private static final String MY_KEY = "MyFragment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_home);
        setTitle("顺电");
        bindView();
        if (savedInstanceState != null) {
            /*获取保存的fragment  没有的话返回null*/
            homeFragment = (HomeFragment) getSupportFragmentManager().getFragment
                    (savedInstanceState, HOME_FRAGMENT_KEY);
            classificationFragment = (ClassificationFragment) getSupportFragmentManager()
                    .getFragment
                            (savedInstanceState, DASHBOARD_FRAGMENT_KEY);
            messageFragment = (MessageFragment) getSupportFragmentManager().getFragment
                    (savedInstanceState, NOTICE_FRAGMENT_KEY);
            shoppingCartFragment = (ShoppingCartFragment) getSupportFragmentManager().getFragment
                    (savedInstanceState, SHOPCAR_KEY);
            myFragment = (MyFragment) getSupportFragmentManager().getFragment
                    (savedInstanceState, MY_KEY);

            addToList(homeFragment);
            addToList(classificationFragment);
            addToList(messageFragment);
            addFragment(shoppingCartFragment);
            addFragment(myFragment);
        } else {
            initFragment();
        }
    }

    private void bindView() {
        tabs = new ArrayList<>();
        //首页
        ImageView ivHome = findViewById(R.id.iv1);
        TextView tvHome = findViewById(R.id.tv1);
        tab1 = new TabView();
        tab1.setView(ivHome, tvHome);
        tab1.setIcon(R.mipmap.ic_launcher, R.mipmap.ic_launcher);
        tab1.setTextColor(getResources().getColor(R.color.white), getResources().getColor(R
                .color.white));
        tabs.add(tab1);
        //分类
        ImageView ivPeisong = findViewById(R.id.iv2);
        TextView tvPeisong = findViewById(R.id.tv2);
        tab2 = new TabView();
        tab2.setView(ivPeisong, tvPeisong);
        tab2.setIcon(R.mipmap.ic_launcher, R.mipmap.ic_launcher);
        tab2.setTextColor(getResources().getColor(R.color.white), getResources().getColor(R
                .color.white));
        //消息
        ImageView ivCenter = findViewById(R.id.iv3);
        TextView tvCenter = findViewById(R.id.tv3);
        tab3 = new TabView();
        tab3.setView(ivCenter, tvCenter);
        tab3.setIcon(R.mipmap.ic_launcher, R.mipmap.ic_launcher);
        tab3.setTextColor(getResources().getColor(R.color.white), getResources().getColor(R
                .color.white));
        //购物车
        ImageView ivShop = findViewById(R.id.iv4);
        TextView tvShop = findViewById(R.id.tv4);
        tab4 = new TabView();
        tab4.setView(ivShop, tvShop);
        tab4.setIcon(R.mipmap.ic_launcher, R.mipmap.ic_launcher);
        tab4.setTextColor(getResources().getColor(R.color.white), getResources().getColor(R
                .color.white));
        //我的
        ImageView ivMy = findViewById(R.id.iv5);
        TextView tvMy = findViewById(R.id.tv5);
        tab5 = new TabView();
        tab5.setView(ivMy, tvMy);
        tab5.setIcon(R.mipmap.ic_launcher, R.mipmap.ic_launcher);
        tab5.setTextColor(getResources().getColor(R.color.white), getResources().getColor(R
                .color.white));
        curTab = tab1;
    }

    private void addToList(Fragment fragment) {
        if (fragment != null) {
            fragmentList.add(fragment);
        }
    }

    private void initFragment() {
        /* 默认显示home  fragment*/
        homeFragment = new HomeFragment();
        addFragment(homeFragment);
        showFragment(homeFragment);
    }

    private void addFragment(Fragment fragment) {
        if (!fragment.isAdded()) {
            getSupportFragmentManager().beginTransaction().add(R.id.tab_content, fragment).commit();
            fragmentList.add(fragment);
        }
    }

    private void showFragment(Fragment fragment) {
        for (Fragment frag : fragmentList) {
            if (frag != fragment) {
                getSupportFragmentManager().beginTransaction().hide(frag).commit();
            }
        }
        getSupportFragmentManager().beginTransaction().show(fragment).commit();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        /*fragment不为空时 保存*/
        if (homeFragment != null) {
            getSupportFragmentManager().putFragment(outState, HOME_FRAGMENT_KEY, homeFragment);
        }
        if (classificationFragment != null) {
            getSupportFragmentManager().putFragment(outState, DASHBOARD_FRAGMENT_KEY,
                    classificationFragment);
        }
        if (messageFragment != null) {
            getSupportFragmentManager().putFragment(outState, NOTICE_FRAGMENT_KEY, messageFragment);
        }
        if (shoppingCartFragment != null) {
            getSupportFragmentManager().putFragment(outState, SHOPCAR_KEY, shoppingCartFragment);
        }
        if (myFragment != null) {
            getSupportFragmentManager().putFragment(outState, MY_KEY, myFragment);
        }
        super.onSaveInstanceState(outState);
    }

    @OnClick({R.id.ll1, R.id.ll2, R.id.ll3, R.id.ll4, R.id.ll5})
    @Override
    public void onClick(View view) {
        super.onClick(view);
        switch (view.getId()) {
            case R.id.ll1:
                //首页
                setChecked(1);
                break;
            case R.id.ll2:
                //分类
                setChecked(2);
                break;
            case R.id.ll3:
                //消息
                setChecked(3);
                break;
            case R.id.ll4:
                //购物车
                setChecked(4);
                break;
            case R.id.ll5:
                //我的
                setChecked(5);
                break;
            default:
                break;
        }
    }


    private void setChecked(int index) {
        switch (index) {
            case 1:
                //首页
                if (homeFragment == null) {
                    homeFragment = new HomeFragment();
                }
                addFragment(homeFragment);
                showFragment(homeFragment);
                selectTab(tab1);
                break;
            case 2:
                setTitle("全部分类");
                if (classificationFragment == null) {
                    classificationFragment = new ClassificationFragment();
                }
                addFragment(classificationFragment);
                showFragment(classificationFragment);
                selectTab(tab2);
                break;
            case 3:
                //消息
                setTitle("消息中心");
                if (messageFragment == null) {
                    messageFragment = new MessageFragment();
                }
                addFragment(messageFragment);
                showFragment(messageFragment);
                selectTab(tab3);
                break;
            case 4:
                //购物车
                setTitle("购物车");
                if (shoppingCartFragment == null) {
                    shoppingCartFragment = new ShoppingCartFragment();
                }
                addFragment(shoppingCartFragment);
                showFragment(shoppingCartFragment);
                selectTab(tab4);
                break;
            case 5:
                if (myFragment == null) {
                    myFragment = new MyFragment();
                }
                addFragment(myFragment);
                showFragment(myFragment);
                selectTab(tab5);
                break;
            default:
                break;
        }
    }

    private void selectTab(TabView tabView) {
        if (null != tabView && !tabView.equals(curTab)) {
            curTab.clickIn();
            tabView.clickOn();
            curTab = tabView;
        }
    }

}
