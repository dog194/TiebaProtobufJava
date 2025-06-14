package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class MemeInfo extends Message {
    public static final String DEFAULT_DETAIL_LINK = "";
    public static final String DEFAULT_PIC_URL = "";
    public static final String DEFAULT_THUMBNAIL = "";

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String detail_link;

    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer height;

    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer pck_id;

    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long pic_id;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pic_url;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String thumbnail;

    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer width;
    public static final Integer DEFAULT_PCK_ID = 0;
    public static final Long DEFAULT_PIC_ID = 0L;
    public static final Integer DEFAULT_WIDTH = 0;
    public static final Integer DEFAULT_HEIGHT = 0;

    public static final class Builder extends Message.Builder<MemeInfo> {
        public String detail_link;
        public Integer height;
        public Integer pck_id;
        public Long pic_id;
        public String pic_url;
        public String thumbnail;
        public Integer width;

        public Builder() {
        }

        public Builder(MemeInfo memeInfo) {
            super(memeInfo);
            if (memeInfo == null) {
                return;
            }
            this.pck_id = memeInfo.pck_id;
            this.pic_id = memeInfo.pic_id;
            this.pic_url = memeInfo.pic_url;
            this.thumbnail = memeInfo.thumbnail;
            this.width = memeInfo.width;
            this.height = memeInfo.height;
            this.detail_link = memeInfo.detail_link;
        }

        @Override // com.squareup.wire.Message.Builder
        public MemeInfo build(boolean z) {
            return new MemeInfo(this, z);
        }
    }

    public MemeInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.pck_id;
            if (num == null) {
                this.pck_id = DEFAULT_PCK_ID;
            } else {
                this.pck_id = num;
            }
            Long l = builder.pic_id;
            if (l == null) {
                this.pic_id = DEFAULT_PIC_ID;
            } else {
                this.pic_id = l;
            }
            String str = builder.pic_url;
            if (str == null) {
                this.pic_url = "";
            } else {
                this.pic_url = str;
            }
            String str2 = builder.thumbnail;
            if (str2 == null) {
                this.thumbnail = "";
            } else {
                this.thumbnail = str2;
            }
            Integer num2 = builder.width;
            if (num2 == null) {
                this.width = DEFAULT_WIDTH;
            } else {
                this.width = num2;
            }
            Integer num3 = builder.height;
            if (num3 == null) {
                this.height = DEFAULT_HEIGHT;
            } else {
                this.height = num3;
            }
            String str3 = builder.detail_link;
            if (str3 == null) {
                this.detail_link = "";
                return;
            } else {
                this.detail_link = str3;
                return;
            }
        }
        this.pck_id = builder.pck_id;
        this.pic_id = builder.pic_id;
        this.pic_url = builder.pic_url;
        this.thumbnail = builder.thumbnail;
        this.width = builder.width;
        this.height = builder.height;
        this.detail_link = builder.detail_link;
    }
}