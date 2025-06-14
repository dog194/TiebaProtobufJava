package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class TailInfo extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_ICON_LINK = "";
    public static final String DEFAULT_ICON_URL = "";
    public static final Integer DEFAULT_TAIL_TYPE = 0;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String content;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon_link;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon_url;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer tail_type;

    public static final class Builder extends Message.Builder<TailInfo> {
        public String content;
        public String icon_link;
        public String icon_url;
        public Integer tail_type;

        public Builder() {
        }

        public Builder(TailInfo tailInfo) {
            super(tailInfo);
            if (tailInfo == null) {
                return;
            }
            this.tail_type = tailInfo.tail_type;
            this.icon_url = tailInfo.icon_url;
            this.icon_link = tailInfo.icon_link;
            this.content = tailInfo.content;
        }

        @Override // com.squareup.wire.Message.Builder
        public TailInfo build(boolean z) {
            return new TailInfo(this, z);
        }
    }

    public TailInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.tail_type;
            if (num == null) {
                this.tail_type = DEFAULT_TAIL_TYPE;
            } else {
                this.tail_type = num;
            }
            String str = builder.icon_url;
            if (str == null) {
                this.icon_url = "";
            } else {
                this.icon_url = str;
            }
            String str2 = builder.icon_link;
            if (str2 == null) {
                this.icon_link = "";
            } else {
                this.icon_link = str2;
            }
            String str3 = builder.content;
            if (str3 == null) {
                this.content = "";
                return;
            } else {
                this.content = str3;
                return;
            }
        }
        this.tail_type = builder.tail_type;
        this.icon_url = builder.icon_url;
        this.icon_link = builder.icon_link;
        this.content = builder.content;
    }
}