package com.agusdfranbex.whatareyoudoingsob;

import android.provider.BaseColumns;

/**
 * Created by agusdfranbex on 3/31/2017.
 */
public class TaskContract {
    public static final String DB_NAME = "WhatAreYouDB";
    public static final int DB_VER = 1;

    public class TaskEntry implements BaseColumns{
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}
