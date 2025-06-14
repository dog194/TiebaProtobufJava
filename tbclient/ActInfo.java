package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ActInfo extends Message {
    public static final String DEFAULT_BANNER_IMG = "";
    public static final String DEFAULT_BANNER_IMG_SIZE = "";
    public static final String DEFAULT_URL = "";

    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer activity_id;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer activity_type;

    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer award_act_id;

    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String banner_img;

    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String banner_img_size;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer begin_time;

    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer component_id;

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer end_time;

    @ProtoField(tag = 10, type = Message.Datatype.BOOL)
    public final Boolean is_senior;

    @ProtoField(tag = 13)
    public final SeniorLottery lottery_senior;

    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer show_total_num;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer status;

    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer total_num;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String url;
    public static final Integer DEFAULT_ACTIVITY_TYPE = 0;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Integer DEFAULT_BEGIN_TIME = 0;
    public static final Integer DEFAULT_END_TIME = 0;
    public static final Integer DEFAULT_TOTAL_NUM = 0;
    public static final Integer DEFAULT_ACTIVITY_ID = 0;
    public static final Integer DEFAULT_AWARD_ACT_ID = 0;
    public static final Integer DEFAULT_COMPONENT_ID = 0;
    public static final Boolean DEFAULT_IS_SENIOR = Boolean.FALSE;
    public static final Integer DEFAULT_SHOW_TOTAL_NUM = 0;

    public static final class Builder extends Message.Builder<ActInfo> {
        public Integer activity_id;
        public Integer activity_type;
        public Integer award_act_id;
        public String banner_img;
        public String banner_img_size;
        public Integer begin_time;
        public Integer component_id;
        public Integer end_time;
        public Boolean is_senior;
        public SeniorLottery lottery_senior;
        public Integer show_total_num;
        public Integer status;
        public Integer total_num;
        public String url;

        public Builder() {
        }

        public Builder(ActInfo actInfo) {
            super(actInfo);
            if (actInfo == null) {
                return;
            }
            this.activity_type = actInfo.activity_type;
            this.status = actInfo.status;
            this.begin_time = actInfo.begin_time;
            this.end_time = actInfo.end_time;
            this.url = actInfo.url;
            this.total_num = actInfo.total_num;
            this.activity_id = actInfo.activity_id;
            this.award_act_id = actInfo.award_act_id;
            this.component_id = actInfo.component_id;
            this.is_senior = actInfo.is_senior;
            this.banner_img = actInfo.banner_img;
            this.banner_img_size = actInfo.banner_img_size;
            this.lottery_senior = actInfo.lottery_senior;
            this.show_total_num = actInfo.show_total_num;
        }

        @Override // com.squareup.wire.Message.Builder
        public ActInfo build(boolean z) {
            return new ActInfo(this, z);
        }
    }

    public ActInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.activity_type;
            if (num == null) {
                this.activity_type = DEFAULT_ACTIVITY_TYPE;
            } else {
                this.activity_type = num;
            }
            Integer num2 = builder.status;
            if (num2 == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num2;
            }
            Integer num3 = builder.begin_time;
            if (num3 == null) {
                this.begin_time = DEFAULT_BEGIN_TIME;
            } else {
                this.begin_time = num3;
            }
            Integer num4 = builder.end_time;
            if (num4 == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = num4;
            }
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            Integer num5 = builder.total_num;
            if (num5 == null) {
                this.total_num = DEFAULT_TOTAL_NUM;
            } else {
                this.total_num = num5;
            }
            Integer num6 = builder.activity_id;
            if (num6 == null) {
                this.activity_id = DEFAULT_ACTIVITY_ID;
            } else {
                this.activity_id = num6;
            }
            Integer num7 = builder.award_act_id;
            if (num7 == null) {
                this.award_act_id = DEFAULT_AWARD_ACT_ID;
            } else {
                this.award_act_id = num7;
            }
            Integer num8 = builder.component_id;
            if (num8 == null) {
                this.component_id = DEFAULT_COMPONENT_ID;
            } else {
                this.component_id = num8;
            }
            Boolean bool = builder.is_senior;
            if (bool == null) {
                this.is_senior = DEFAULT_IS_SENIOR;
            } else {
                this.is_senior = bool;
            }
            String str2 = builder.banner_img;
            if (str2 == null) {
                this.banner_img = "";
            } else {
                this.banner_img = str2;
            }
            String str3 = builder.banner_img_size;
            if (str3 == null) {
                this.banner_img_size = "";
            } else {
                this.banner_img_size = str3;
            }
            this.lottery_senior = builder.lottery_senior;
            Integer num9 = builder.show_total_num;
            if (num9 == null) {
                this.show_total_num = DEFAULT_SHOW_TOTAL_NUM;
                return;
            } else {
                this.show_total_num = num9;
                return;
            }
        }
        this.activity_type = builder.activity_type;
        this.status = builder.status;
        this.begin_time = builder.begin_time;
        this.end_time = builder.end_time;
        this.url = builder.url;
        this.total_num = builder.total_num;
        this.activity_id = builder.activity_id;
        this.award_act_id = builder.award_act_id;
        this.component_id = builder.component_id;
        this.is_senior = builder.is_senior;
        this.banner_img = builder.banner_img;
        this.banner_img_size = builder.banner_img_size;
        this.lottery_senior = builder.lottery_senior;
        this.show_total_num = builder.show_total_num;
    }
}