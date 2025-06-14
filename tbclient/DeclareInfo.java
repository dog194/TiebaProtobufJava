package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class DeclareInfo extends Message {
    public static final String DEFAULT_DECLARE_TEXT = "";
    public static final String DEFAULT_DECLARE_URL = "";

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer declare_id;

    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long declare_num;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String declare_text;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String declare_url;

    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer is_declare;
    public static final Integer DEFAULT_DECLARE_ID = 0;
    public static final Long DEFAULT_DECLARE_NUM = 0L;
    public static final Integer DEFAULT_IS_DECLARE = 0;

    public static final class Builder extends Message.Builder<DeclareInfo> {
        public Integer declare_id;
        public Long declare_num;
        public String declare_text;
        public String declare_url;
        public Integer is_declare;

        public Builder() {
        }

        public Builder(DeclareInfo declareInfo) {
            super(declareInfo);
            if (declareInfo == null) {
                return;
            }
            this.declare_id = declareInfo.declare_id;
            this.declare_url = declareInfo.declare_url;
            this.declare_text = declareInfo.declare_text;
            this.declare_num = declareInfo.declare_num;
            this.is_declare = declareInfo.is_declare;
        }

        @Override // com.squareup.wire.Message.Builder
        public DeclareInfo build(boolean z) {
            return new DeclareInfo(this, z);
        }
    }

    public DeclareInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.declare_id;
            if (num == null) {
                this.declare_id = DEFAULT_DECLARE_ID;
            } else {
                this.declare_id = num;
            }
            String str = builder.declare_url;
            if (str == null) {
                this.declare_url = "";
            } else {
                this.declare_url = str;
            }
            String str2 = builder.declare_text;
            if (str2 == null) {
                this.declare_text = "";
            } else {
                this.declare_text = str2;
            }
            Long l = builder.declare_num;
            if (l == null) {
                this.declare_num = DEFAULT_DECLARE_NUM;
            } else {
                this.declare_num = l;
            }
            Integer num2 = builder.is_declare;
            if (num2 == null) {
                this.is_declare = DEFAULT_IS_DECLARE;
                return;
            } else {
                this.is_declare = num2;
                return;
            }
        }
        this.declare_id = builder.declare_id;
        this.declare_url = builder.declare_url;
        this.declare_text = builder.declare_text;
        this.declare_num = builder.declare_num;
        this.is_declare = builder.is_declare;
    }
}