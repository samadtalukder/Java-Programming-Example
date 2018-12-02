package com.nested_class;

public class InnerClasses {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    class Coupon {
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
        InnerClasses innerClasses = new InnerClasses();
        innerClasses.setName("Umazon");
        InnerClasses.Coupon iCoupon = innerClasses.new Coupon();
        iCoupon.setDiscount(5);
        iCoupon.setOffer("Black Friday Offer");
        System.out.println("Shop Name: "+innerClasses.getName());
        System.out.println("Offer Name: "+iCoupon.getOffer());
        System.out.println("Discount: "+iCoupon.getDiscount()+"%");


    }
}
