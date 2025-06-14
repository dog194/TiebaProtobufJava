package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class Banner extends Message {
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PIC = "";
    public static final String DEFAULT_URL = "";

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String desc;

    @ProtoField(tag = 8, type = Message.Datatype.UINT64)
    public final Long end_time;

    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer id;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pic;

    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long start_time;

    @ProtoField(tag = 4)
    public final ThreadInfo thread_info;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String url;
    public static final Integer DEFAULT_ID = 0;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final Long DEFAULT_END_TIME = 0L;

    public static final class Builder extends Message.Builder<Banner> {
        public String desc;
        public Long end_time;
        public Integer id;
        public String name;
        public String pic;
        public Long start_time;
        public ThreadInfo thread_info;
        public String url;

        public Builder() {
        }

        public Builder(Banner banner) {
            super(banner);
            if (banner == null) {
                return;
            }
            this.name = banner.name;
            this.desc = banner.desc;
            this.pic = banner.pic;
            this.thread_info = banner.thread_info;
            this.url = banner.url;
            this.id = banner.id;
            this.start_time = banner.start_time;
            this.end_time = banner.end_time;
        }

        @Override // com.squareup.wire.Message.Builder
        public Banner build(boolean z) {
            return new Banner(this, z);
        }
    }

    public Banner(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.desc;
            if (str2 == null) {
                this.desc = "";
            } else {
                this.desc = str2;
            }
            String str3 = builder.pic;
            if (str3 == null) {
                this.pic = "";
            } else {
                this.pic = str3;
            }
            this.thread_info = builder.thread_info;
            String str4 = builder.url;
            if (str4 == null) {
                this.url = "";
            } else {
                this.url = str4;
            }
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            Long l = builder.start_time;
            if (l == null) {
                this.start_time = DEFAULT_START_TIME;
            } else {
                this.start_time = l;
            }
            Long l2 = builder.end_time;
            if (l2 == null) {
                this.end_time = DEFAULT_END_TIME;
                return;
            } else {
                this.end_time = l2;
                return;
            }
        }
        this.name = builder.name;
        this.desc = builder.desc;
        this.pic = builder.pic;
        this.thread_info = builder.thread_info;
        this.url = builder.url;
        this.id = builder.id;
        this.start_time = builder.start_time;
        this.end_time = builder.end_time;
    }
}