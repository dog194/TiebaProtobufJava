package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class Abstract extends Message {
    public static final String DEFAULT_DURING_TIME = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_SRC = "";
    public static final String DEFAULT_TEXT = "";
    public static final Integer DEFAULT_TYPE = 0;
    public static final String DEFAULT_UN = "";
    public static final String DEFAULT_VOICE_MD5 = "";

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String during_time;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String link;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String src;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String text;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String un;

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String voice_md5;

    public static final class Builder extends Message.Builder<Abstract> {
        public String during_time;
        public String link;
        public String src;
        public String text;
        public Integer type;
        public String un;
        public String voice_md5;

        public Builder() {
        }

        public Builder(Abstract r2) {
            super(r2);
            if (r2 == null) {
                return;
            }
            this.type = r2.type;
            this.text = r2.text;
            this.link = r2.link;
            this.src = r2.src;
            this.un = r2.un;
            this.during_time = r2.during_time;
            this.voice_md5 = r2.voice_md5;
        }

        @Override // com.squareup.wire.Message.Builder
        public Abstract build(boolean z) {
            return new Abstract(this, z);
        }
    }

    public Abstract(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str = builder.text;
            if (str == null) {
                this.text = "";
            } else {
                this.text = str;
            }
            String str2 = builder.link;
            if (str2 == null) {
                this.link = "";
            } else {
                this.link = str2;
            }
            String str3 = builder.src;
            if (str3 == null) {
                this.src = "";
            } else {
                this.src = str3;
            }
            String str4 = builder.un;
            if (str4 == null) {
                this.un = "";
            } else {
                this.un = str4;
            }
            String str5 = builder.during_time;
            if (str5 == null) {
                this.during_time = "";
            } else {
                this.during_time = str5;
            }
            String str6 = builder.voice_md5;
            if (str6 == null) {
                this.voice_md5 = "";
                return;
            } else {
                this.voice_md5 = str6;
                return;
            }
        }
        this.type = builder.type;
        this.text = builder.text;
        this.link = builder.link;
        this.src = builder.src;
        this.un = builder.un;
        this.during_time = builder.during_time;
        this.voice_md5 = builder.voice_md5;
    }
}