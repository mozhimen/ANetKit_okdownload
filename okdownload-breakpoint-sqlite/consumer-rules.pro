# ------- because of we using com.liulishuo.okdownload:sqlite on sample ----
-keep class com.liulishuo.okdownload.core.breakpoint.BreakpointStoreOnSQLite {
        public com.liulishuo.okdownload.core.breakpoint.DownloadStore createRemitSelf();
        public com.liulishuo.okdownload.core.breakpoint.BreakpointStoreOnSQLite(android.content.Context,com.liulishuo.okdownload.core.breakpoint.IBreakpointCompare);
}
# ------- end com.liulishuo.okdownload:sqlite proguard rules ----