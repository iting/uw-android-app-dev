package edu.uw.aad.mzm.sample.database.data;

import android.provider.BaseColumns;

/**
 * Created by Margaret on 2/19/2015.
 *
 * Contains static classes to define table schema etc.
 */
public class Android implements BaseColumns {

    public static final String DATABASE_NAME = "android";

    /**
     * Define the Version table
     */
    public static final class Version {

        // Define table name
        public static final String TABLE_NAME = "version";

        // Define table columns
        public static final String ID = BaseColumns._ID;
        public static final String CODE_NAME = "code_name";
        public static final String VERSION_NO = "version_no";
        public static final String API_LEVEL = "api_level";
        public static final String RELEASE_DATE = "release_date";
        public static final String FEATURES = "features";

        // Define projection for Version table
        public static final String[] PROJECTION = new String[] {
                /*0*/ Android.Version.ID,
                /*1*/ Android.Version.CODE_NAME,
                /*2*/ Android.Version.VERSION_NO,
                /*3*/ Android.Version.API_LEVEL,
                /*4*/ Android.Version.RELEASE_DATE,
                /*5*/ Android.Version.FEATURES
        };
    }
}
