package tbclient.ThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AdMixFloor;
import tbclient.BannerList;
import tbclient.FeedKV;
import tbclient.ThreadInfo;
import tbclient.User;

/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_AD_SAMPLE_MAP_KEY = "";
    public static final String DEFAULT_ASP_SHOWN_INFO = "";
    public static final String DEFAULT_PARTIAL_VISIBLE_TOAST = "";

    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<AdMixFloor> ad_mix_list;

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String ad_sample_map_key;

    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer ad_show_select;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String asp_shown_info;

    @ProtoField(tag = 3)
    public final BannerList banner_list;

    @ProtoField(label = Message.Label.REPEATED, tag = 10)
    public final List<FeedKV> log_param;

    @ProtoField(tag = 9)
    public final PageData page_data;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String partial_visible_toast;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> thread_list;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<User> user_list;
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
    public static final List<AdMixFloor> DEFAULT_AD_MIX_LIST = Collections.emptyList();
    public static final Integer DEFAULT_AD_SHOW_SELECT = 0;
    public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();

    public static final class Builder extends Message.Builder<DataRes> {
        public List<AdMixFloor> ad_mix_list;
        public String ad_sample_map_key;
        public Integer ad_show_select;
        public String asp_shown_info;
        public BannerList banner_list;
        public List<FeedKV> log_param;
        public PageData page_data;
        public String partial_visible_toast;
        public List<ThreadInfo> thread_list;
        public List<User> user_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.thread_list = Message.copyOf(dataRes.thread_list);
            this.user_list = Message.copyOf(dataRes.user_list);
            this.banner_list = dataRes.banner_list;
            this.asp_shown_info = dataRes.asp_shown_info;
            this.partial_visible_toast = dataRes.partial_visible_toast;
            this.ad_mix_list = Message.copyOf(dataRes.ad_mix_list);
            this.ad_show_select = dataRes.ad_show_select;
            this.ad_sample_map_key = dataRes.ad_sample_map_key;
            this.page_data = dataRes.page_data;
            this.log_param = Message.copyOf(dataRes.log_param);
        }

        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ThreadInfo> list = builder.thread_list;
            if (list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = Message.immutableCopyOf(list);
            }
            List<User> list2 = builder.user_list;
            if (list2 == null) {
                this.user_list = DEFAULT_USER_LIST;
            } else {
                this.user_list = Message.immutableCopyOf(list2);
            }
            this.banner_list = builder.banner_list;
            String str = builder.asp_shown_info;
            if (str == null) {
                this.asp_shown_info = "";
            } else {
                this.asp_shown_info = str;
            }
            String str2 = builder.partial_visible_toast;
            if (str2 == null) {
                this.partial_visible_toast = "";
            } else {
                this.partial_visible_toast = str2;
            }
            List<AdMixFloor> list3 = builder.ad_mix_list;
            if (list3 == null) {
                this.ad_mix_list = DEFAULT_AD_MIX_LIST;
            } else {
                this.ad_mix_list = Message.immutableCopyOf(list3);
            }
            Integer num = builder.ad_show_select;
            if (num == null) {
                this.ad_show_select = DEFAULT_AD_SHOW_SELECT;
            } else {
                this.ad_show_select = num;
            }
            String str3 = builder.ad_sample_map_key;
            if (str3 == null) {
                this.ad_sample_map_key = "";
            } else {
                this.ad_sample_map_key = str3;
            }
            this.page_data = builder.page_data;
            List<FeedKV> list4 = builder.log_param;
            if (list4 == null) {
                this.log_param = DEFAULT_LOG_PARAM;
                return;
            } else {
                this.log_param = Message.immutableCopyOf(list4);
                return;
            }
        }
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.user_list = Message.immutableCopyOf(builder.user_list);
        this.banner_list = builder.banner_list;
        this.asp_shown_info = builder.asp_shown_info;
        this.partial_visible_toast = builder.partial_visible_toast;
        this.ad_mix_list = Message.immutableCopyOf(builder.ad_mix_list);
        this.ad_show_select = builder.ad_show_select;
        this.ad_sample_map_key = builder.ad_sample_map_key;
        this.page_data = builder.page_data;
        this.log_param = Message.immutableCopyOf(builder.log_param);
    }
}