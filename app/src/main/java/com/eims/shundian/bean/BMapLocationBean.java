package com.eims.shundian.bean;

import java.util.List;

/**
 * @author bobo
 * @date 2018/10/22
 * describe
 */
public class BMapLocationBean {

    /**
     * status : 0
     * result : {"location":{"lng":113.85307799999997,"lat":22.612059001056455},"formatted_address":"广东省深圳市宝安区航城大道","business":"","addressComponent":{"country":"中国","country_code":0,"country_code_iso":"CHN","country_code_iso2":"CN","province":"广东省","city":"深圳市","city_level":2,"district":"宝安区","town":"","adcode":"440306","street":"航城大道","street_number":"","direction":"","distance":""},"pois":[{"addr":"广东省深圳市宝安区深圳航城创新创业园(广豪锋工业园西","cp":"","direction":"内","distance":"0","name":"深圳航城创新创业园","poiType":"公司企业","point":{"x":113.8536836910755,"y":22.611966329960886},"tag":"公司企业;园区","tel":"","uid":"e310facd6a53b796d7b74e45","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"西乡街道宝安大道与航城大道交汇处","cp":"","direction":"内","distance":"0","name":"西乡安居家园","poiType":"房地产","point":{"x":113.85257877529858,"y":22.611557635798277},"tag":"房地产;住宅区","tel":"","uid":"8c57fa6df29a8b26c9fa5f48","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"深圳宝安区西乡街道固戍社区航城工业区综合楼3-5层（固戍地铁站D出口）","cp":" ","direction":"西北","distance":"112","name":"深圳蓝航精品酒店","poiType":"酒店","point":{"x":113.85378250468156,"y":22.611390821501388},"tag":"酒店;其他","tel":"","uid":"d01f7fe383ccd71c871541a1","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"广东省深圳市宝安区航城大道航城创新创业孵化基地附近","cp":" ","direction":"西北","distance":"126","name":"深圳航城创新创业园-东南门","poiType":"出入口","point":{"x":113.85405199633446,"y":22.611507591530696},"tag":"出入口;门","tel":"","uid":"cd0ee44f8380b50aadcb6659","zip":"","parent_poi":{"name":"深圳航城创新创业园","tag":"公司企业;园区","addr":"广东省深圳市宝安区深圳航城创新创业园(广豪锋工业园西)","point":{"x":113.8536836910755,"y":22.611966329960886},"direction":"西","distance":"68","uid":"e310facd6a53b796d7b74e45"}},{"addr":"深圳市宝安区航城大道","cp":" ","direction":"西北","distance":"134","name":"航城固戍工业区","poiType":"公司企业","point":{"x":113.85380047079175,"y":22.611157281141992},"tag":"公司企业;园区","tel":"","uid":"f4a33da91c3d06753010afd3","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"深圳市宝安区西乡安居家园6栋","cp":" ","direction":"北","distance":"96","name":"安居家园幼儿园","poiType":"教育培训","point":{"x":113.85303691110853,"y":22.61125736991655},"tag":"教育培训;幼儿园","tel":"","uid":"2d972b3daae9b4412cb17eff","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"深圳市宝安区航空路7号","cp":" ","direction":"西南","distance":"228","name":"索佳科技园","poiType":"公司企业","point":{"x":113.85402504716917,"y":22.613751224765153},"tag":"公司企业;园区","tel":"","uid":"81d6a509f5fa61436f20b9e2","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"西乡街道西乡镇三围村航空路7号索佳科技园(小店旁边)","cp":" ","direction":"南","distance":"150","name":"索佳电视","poiType":"房地产","point":{"x":113.8531177586044,"y":22.613317514163697},"tag":"房地产;写字楼","tel":"","uid":"9dfb1ade526f3d152fb17e0d","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"固戍航城大道福森工业区F栋1楼","cp":" ","direction":"北","distance":"249","name":"万家福百货(航城大道)","poiType":"购物","point":{"x":113.85353996219395,"y":22.610022936548912},"tag":"购物;超市","tel":"","uid":"606289fd36d75e30a204646b","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"深圳宝安区宝安大道与固戍二路交汇处万象新天","cp":" ","direction":"西北","distance":"289","name":"深圳机场U米驿站","poiType":"酒店","point":{"x":113.85461792880557,"y":22.610114685360315},"tag":"酒店;其他","tel":"","uid":"2accfcd0b86f76a34c6d46c2","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}}],"roads":[],"poiRegions":[{"direction_desc":"内","name":"深圳航城创新创业园","tag":"公司企业;园区","uid":"e310facd6a53b796d7b74e45"},{"direction_desc":"内","name":"西乡安居家园","tag":"房地产;住宅区","uid":"8c57fa6df29a8b26c9fa5f48"}],"sematic_description":"西乡安居家园内,安居家园幼儿园北96米","cityCode":340}
     */

    private int status;
    private ResultBean result;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * location : {"lng":113.85307799999997,"lat":22.612059001056455}
         * formatted_address : 广东省深圳市宝安区航城大道
         * business :
         * addressComponent : {"country":"中国","country_code":0,"country_code_iso":"CHN","country_code_iso2":"CN","province":"广东省","city":"深圳市","city_level":2,"district":"宝安区","town":"","adcode":"440306","street":"航城大道","street_number":"","direction":"","distance":""}
         * pois : [{"addr":"广东省深圳市宝安区深圳航城创新创业园(广豪锋工业园西","cp":"","direction":"内","distance":"0","name":"深圳航城创新创业园","poiType":"公司企业","point":{"x":113.8536836910755,"y":22.611966329960886},"tag":"公司企业;园区","tel":"","uid":"e310facd6a53b796d7b74e45","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"西乡街道宝安大道与航城大道交汇处","cp":"","direction":"内","distance":"0","name":"西乡安居家园","poiType":"房地产","point":{"x":113.85257877529858,"y":22.611557635798277},"tag":"房地产;住宅区","tel":"","uid":"8c57fa6df29a8b26c9fa5f48","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"深圳宝安区西乡街道固戍社区航城工业区综合楼3-5层（固戍地铁站D出口）","cp":" ","direction":"西北","distance":"112","name":"深圳蓝航精品酒店","poiType":"酒店","point":{"x":113.85378250468156,"y":22.611390821501388},"tag":"酒店;其他","tel":"","uid":"d01f7fe383ccd71c871541a1","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"广东省深圳市宝安区航城大道航城创新创业孵化基地附近","cp":" ","direction":"西北","distance":"126","name":"深圳航城创新创业园-东南门","poiType":"出入口","point":{"x":113.85405199633446,"y":22.611507591530696},"tag":"出入口;门","tel":"","uid":"cd0ee44f8380b50aadcb6659","zip":"","parent_poi":{"name":"深圳航城创新创业园","tag":"公司企业;园区","addr":"广东省深圳市宝安区深圳航城创新创业园(广豪锋工业园西)","point":{"x":113.8536836910755,"y":22.611966329960886},"direction":"西","distance":"68","uid":"e310facd6a53b796d7b74e45"}},{"addr":"深圳市宝安区航城大道","cp":" ","direction":"西北","distance":"134","name":"航城固戍工业区","poiType":"公司企业","point":{"x":113.85380047079175,"y":22.611157281141992},"tag":"公司企业;园区","tel":"","uid":"f4a33da91c3d06753010afd3","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"深圳市宝安区西乡安居家园6栋","cp":" ","direction":"北","distance":"96","name":"安居家园幼儿园","poiType":"教育培训","point":{"x":113.85303691110853,"y":22.61125736991655},"tag":"教育培训;幼儿园","tel":"","uid":"2d972b3daae9b4412cb17eff","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"深圳市宝安区航空路7号","cp":" ","direction":"西南","distance":"228","name":"索佳科技园","poiType":"公司企业","point":{"x":113.85402504716917,"y":22.613751224765153},"tag":"公司企业;园区","tel":"","uid":"81d6a509f5fa61436f20b9e2","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"西乡街道西乡镇三围村航空路7号索佳科技园(小店旁边)","cp":" ","direction":"南","distance":"150","name":"索佳电视","poiType":"房地产","point":{"x":113.8531177586044,"y":22.613317514163697},"tag":"房地产;写字楼","tel":"","uid":"9dfb1ade526f3d152fb17e0d","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"固戍航城大道福森工业区F栋1楼","cp":" ","direction":"北","distance":"249","name":"万家福百货(航城大道)","poiType":"购物","point":{"x":113.85353996219395,"y":22.610022936548912},"tag":"购物;超市","tel":"","uid":"606289fd36d75e30a204646b","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"深圳宝安区宝安大道与固戍二路交汇处万象新天","cp":" ","direction":"西北","distance":"289","name":"深圳机场U米驿站","poiType":"酒店","point":{"x":113.85461792880557,"y":22.610114685360315},"tag":"酒店;其他","tel":"","uid":"2accfcd0b86f76a34c6d46c2","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}}]
         * roads : []
         * poiRegions : [{"direction_desc":"内","name":"深圳航城创新创业园","tag":"公司企业;园区","uid":"e310facd6a53b796d7b74e45"},{"direction_desc":"内","name":"西乡安居家园","tag":"房地产;住宅区","uid":"8c57fa6df29a8b26c9fa5f48"}]
         * sematic_description : 西乡安居家园内,安居家园幼儿园北96米
         * cityCode : 340
         */

        private LocationBean location;
        private String formatted_address;
        private String business;
        private AddressComponentBean addressComponent;
        private String sematic_description;
        private int cityCode;
        private List<PoisBean> pois;
        private List<?> roads;
        private List<PoiRegionsBean> poiRegions;

        public LocationBean getLocation() {
            return location;
        }

        public void setLocation(LocationBean location) {
            this.location = location;
        }

        public String getFormatted_address() {
            return formatted_address;
        }

        public void setFormatted_address(String formatted_address) {
            this.formatted_address = formatted_address;
        }

        public String getBusiness() {
            return business;
        }

        public void setBusiness(String business) {
            this.business = business;
        }

        public AddressComponentBean getAddressComponent() {
            return addressComponent;
        }

        public void setAddressComponent(AddressComponentBean addressComponent) {
            this.addressComponent = addressComponent;
        }

        public String getSematic_description() {
            return sematic_description;
        }

        public void setSematic_description(String sematic_description) {
            this.sematic_description = sematic_description;
        }

        public int getCityCode() {
            return cityCode;
        }

        public void setCityCode(int cityCode) {
            this.cityCode = cityCode;
        }

        public List<PoisBean> getPois() {
            return pois;
        }

        public void setPois(List<PoisBean> pois) {
            this.pois = pois;
        }

        public List<?> getRoads() {
            return roads;
        }

        public void setRoads(List<?> roads) {
            this.roads = roads;
        }

        public List<PoiRegionsBean> getPoiRegions() {
            return poiRegions;
        }

        public void setPoiRegions(List<PoiRegionsBean> poiRegions) {
            this.poiRegions = poiRegions;
        }

        public static class LocationBean {
            /**
             * lng : 113.85307799999997
             * lat : 22.612059001056455
             */

            private double lng;
            private double lat;

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }
        }

        public static class AddressComponentBean {
            /**
             * country : 中国
             * country_code : 0
             * country_code_iso : CHN
             * country_code_iso2 : CN
             * province : 广东省
             * city : 深圳市
             * city_level : 2
             * district : 宝安区
             * town :
             * adcode : 440306
             * street : 航城大道
             * street_number :
             * direction :
             * distance :
             */

            private String country;
            private int country_code;
            private String country_code_iso;
            private String country_code_iso2;
            private String province;
            private String city;
            private int city_level;
            private String district;
            private String town;
            private String adcode;
            private String street;
            private String street_number;
            private String direction;
            private String distance;

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public int getCountry_code() {
                return country_code;
            }

            public void setCountry_code(int country_code) {
                this.country_code = country_code;
            }

            public String getCountry_code_iso() {
                return country_code_iso;
            }

            public void setCountry_code_iso(String country_code_iso) {
                this.country_code_iso = country_code_iso;
            }

            public String getCountry_code_iso2() {
                return country_code_iso2;
            }

            public void setCountry_code_iso2(String country_code_iso2) {
                this.country_code_iso2 = country_code_iso2;
            }

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public int getCity_level() {
                return city_level;
            }

            public void setCity_level(int city_level) {
                this.city_level = city_level;
            }

            public String getDistrict() {
                return district;
            }

            public void setDistrict(String district) {
                this.district = district;
            }

            public String getTown() {
                return town;
            }

            public void setTown(String town) {
                this.town = town;
            }

            public String getAdcode() {
                return adcode;
            }

            public void setAdcode(String adcode) {
                this.adcode = adcode;
            }

            public String getStreet() {
                return street;
            }

            public void setStreet(String street) {
                this.street = street;
            }

            public String getStreet_number() {
                return street_number;
            }

            public void setStreet_number(String street_number) {
                this.street_number = street_number;
            }

            public String getDirection() {
                return direction;
            }

            public void setDirection(String direction) {
                this.direction = direction;
            }

            public String getDistance() {
                return distance;
            }

            public void setDistance(String distance) {
                this.distance = distance;
            }
        }

        public static class PoisBean {
            /**
             * addr : 广东省深圳市宝安区深圳航城创新创业园(广豪锋工业园西
             * cp :
             * direction : 内
             * distance : 0
             * name : 深圳航城创新创业园
             * poiType : 公司企业
             * point : {"x":113.8536836910755,"y":22.611966329960886}
             * tag : 公司企业;园区
             * tel :
             * uid : e310facd6a53b796d7b74e45
             * zip :
             * parent_poi : {"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}
             */

            private String addr;
            private String cp;
            private String direction;
            private String distance;
            private String name;
            private String poiType;
            private PointBean point;
            private String tag;
            private String tel;
            private String uid;
            private String zip;
            private ParentPoiBean parent_poi;

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public String getCp() {
                return cp;
            }

            public void setCp(String cp) {
                this.cp = cp;
            }

            public String getDirection() {
                return direction;
            }

            public void setDirection(String direction) {
                this.direction = direction;
            }

            public String getDistance() {
                return distance;
            }

            public void setDistance(String distance) {
                this.distance = distance;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPoiType() {
                return poiType;
            }

            public void setPoiType(String poiType) {
                this.poiType = poiType;
            }

            public PointBean getPoint() {
                return point;
            }

            public void setPoint(PointBean point) {
                this.point = point;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getTel() {
                return tel;
            }

            public void setTel(String tel) {
                this.tel = tel;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getZip() {
                return zip;
            }

            public void setZip(String zip) {
                this.zip = zip;
            }

            public ParentPoiBean getParent_poi() {
                return parent_poi;
            }

            public void setParent_poi(ParentPoiBean parent_poi) {
                this.parent_poi = parent_poi;
            }

            public static class PointBean {
                /**
                 * x : 113.8536836910755
                 * y : 22.611966329960886
                 */

                private double x;
                private double y;

                public double getX() {
                    return x;
                }

                public void setX(double x) {
                    this.x = x;
                }

                public double getY() {
                    return y;
                }

                public void setY(double y) {
                    this.y = y;
                }
            }

            public static class ParentPoiBean {
                /**
                 * name :
                 * tag :
                 * addr :
                 * point : {"x":0,"y":0}
                 * direction :
                 * distance :
                 * uid :
                 */

                private String name;
                private String tag;
                private String addr;
                private PointBeanX point;
                private String direction;
                private String distance;
                private String uid;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getTag() {
                    return tag;
                }

                public void setTag(String tag) {
                    this.tag = tag;
                }

                public String getAddr() {
                    return addr;
                }

                public void setAddr(String addr) {
                    this.addr = addr;
                }

                public PointBeanX getPoint() {
                    return point;
                }

                public void setPoint(PointBeanX point) {
                    this.point = point;
                }

                public String getDirection() {
                    return direction;
                }

                public void setDirection(String direction) {
                    this.direction = direction;
                }

                public String getDistance() {
                    return distance;
                }

                public void setDistance(String distance) {
                    this.distance = distance;
                }

                public String getUid() {
                    return uid;
                }

                public void setUid(String uid) {
                    this.uid = uid;
                }

                public static class PointBeanX {
                    /**
                     * x : 0
                     * y : 0
                     */

                    private int x;
                    private int y;

                    public int getX() {
                        return x;
                    }

                    public void setX(int x) {
                        this.x = x;
                    }

                    public int getY() {
                        return y;
                    }

                    public void setY(int y) {
                        this.y = y;
                    }
                }
            }
        }

        public static class PoiRegionsBean {
            /**
             * direction_desc : 内
             * name : 深圳航城创新创业园
             * tag : 公司企业;园区
             * uid : e310facd6a53b796d7b74e45
             */

            private String direction_desc;
            private String name;
            private String tag;
            private String uid;

            public String getDirection_desc() {
                return direction_desc;
            }

            public void setDirection_desc(String direction_desc) {
                this.direction_desc = direction_desc;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }
        }
    }
}
