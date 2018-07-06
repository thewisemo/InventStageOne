package com.example.wisemo.myinventory.data;

import android.provider.BaseColumns;

public final class ItemContract {

    // Private constructor.
    private ItemContract() {
    }

    /* Inner class that defines the ItemEntry table contents */
    public static class ItemEntry implements BaseColumns {

        public static final String TABLE_NAME = "items";

        public static final String _ID = BaseColumns._ID;

        public static final String COLUMN_ITEM_CATEGORY_TYPE = "type";
        public static final String COLUMN_ITEM_PRODUCT_NAME = "product_name";
        public static final String COLUMN_ITEM_DESCRIPTION = "description";
        public static final String COLUMN_ITEM_AVAILABILITY = "availability";
        public static final String COLUMN_ITEM_PRICE = "price";
        public static final String COLUMN_ITEM_QUANTITY = "quantity";
        public static final String COLUMN_ITEM_SUPPLIER_NAME = "supplier_name";
        public static final String COLUMN_ITEM_SUPPLIER_PHONE_NUMBER = "phone_number";

        /* Additional constance for product item type */
        public static final int TYPE_CASUAL = 0;
        public static final int TYPE_FORMAL = 1;
        public static final int TYPE_COTTON_SOCKS = 2;
        public static final int TYPE_CARE_PRODUCTS = 3;
        public static final int TYPE_BELTS_AND_WALLETS = 4;

        public static final int ITEM_IN_STOCK = 1;
        public static final int ITEM_OUT_STOCK = 0;

        /* Additional constance for product item Suppliers Names*/
        public final static int SUPPLIER_MAIN = 0;
        public final static int SUPPLIER_NUMBER_ONE = 1;
        public final static int SUPPLIER_NUMBER_TWO = 2;
        public final static int SUPPLIER_NUMBER_THREE = 3;
    }
}
