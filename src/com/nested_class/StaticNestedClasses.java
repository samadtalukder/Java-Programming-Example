package com.nested_class;

public class StaticNestedClasses {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static class Coupon {
        private String offer;
        private int discount;

        public String getOffer() {
            return offer;
        }

        public int getDiscount() {
            return discount;
        }

        public void setOffer(String offer) {
            this.offer = offer;
        }

        public void setDiscount(int discount) {
            this.discount = discount;
        }
    }

    public static void main(String[] args) {
        StaticNestedClasses staticNestedClass = new StaticNestedClasses();
        staticNestedClass.setName("ShopUr");
        StaticNestedClasses.Coupon coupon = new StaticNestedClasses.Coupon();
        coupon.setDiscount(10);
        coupon.setOffer("Winter Offer On Shirt 10%");
        System.out.println("Shop Name: "+staticNestedClass.getName());
        System.out.println("Offer Name: "+coupon.getOffer());
        System.out.println("Discount: "+coupon.getDiscount()+"%");
    }

}
