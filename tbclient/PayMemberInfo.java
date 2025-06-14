package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class PayMemberInfo extends Message {
    public static final String DEFAULT_EXPIRE_REMIND = "";
    public static final String DEFAULT_PIC_URL = "";
    public static final String DEFAULT_URL = "";

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer end_time;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String expire_remind;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String pic_url;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer props_id;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String url;
    public static final Integer DEFAULT_PROPS_ID = 0;
    public static final Integer DEFAULT_END_TIME = 0;

    public static final class Builder extends Message.Builder<PayMemberInfo> {
        public Integer end_time;
        public String expire_remind;
        public String pic_url;
        public Integer props_id;
        public String url;

        public Builder() {
        }

        public Builder(PayMemberInfo payMemberInfo) {
            super(payMemberInfo);
            if (payMemberInfo == null) {
                return;
            }
            this.props_id = payMemberInfo.props_id;
            this.end_time = payMemberInfo.end_time;
            this.url = payMemberInfo.url;
            this.expire_remind = payMemberInfo.expire_remind;
            this.pic_url = payMemberInfo.pic_url;
        }

        @Override // com.squareup.wire.Message.Builder
        public PayMemberInfo build(boolean z) {
            return new PayMemberInfo(this, z);
        }
    }

    public PayMemberInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.props_id;
            if (num == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = num;
            }
            Integer num2 = builder.end_time;
            if (num2 == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = num2;
            }
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            String str2 = builder.expire_remind;
            if (str2 == null) {
                this.expire_remind = "";
            } else {
                this.expire_remind = str2;
            }
            String str3 = builder.pic_url;
            if (str3 == null) {
                this.pic_url = "";
                return;
            } else {
                this.pic_url = str3;
                return;
            }
        }
        this.props_id = builder.props_id;
        this.end_time = builder.end_time;
        this.url = builder.url;
        this.expire_remind = builder.expire_remind;
        this.pic_url = builder.pic_url;
    }
}