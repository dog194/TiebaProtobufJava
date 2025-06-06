package protobuf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class PollInfo extends Message {
    public static final String DEFAULT_POLLEDVALUE = "";
    public static final String DEFAULT_TIPS = "";
    public static final String DEFAULT_TITLE = "";

    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer endTime;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer isMulti;

    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer isPolled;

    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer lastTime;

    @ProtoField(label = Message.Label.REPEATED, tag = 9)
    public final List<PollOption> options;

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer optionsCount;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String polledValue;

    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer status;

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String tips;

    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String title;

    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long totalNum;

    @ProtoField(tag = 11, type = Message.Datatype.INT64)
    public final Long totalPoll;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_ISMULTI = 0;
    public static final Long DEFAULT_TOTALNUM = 0L;
    public static final Integer DEFAULT_OPTIONSCOUNT = 0;
    public static final Integer DEFAULT_ISPOLLED = 0;
    public static final Integer DEFAULT_ENDTIME = 0;
    public static final List<PollOption> DEFAULT_OPTIONS = Collections.emptyList();
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_TOTALPOLL = 0L;
    public static final Integer DEFAULT_LASTTIME = 0;

    public static final class Builder extends Message.Builder<PollInfo> {
        public Integer endTime;
        public Integer isMulti;
        public Integer isPolled;
        public Integer lastTime;
        public List<PollOption> options;
        public Integer optionsCount;
        public String polledValue;
        public Integer status;
        public String tips;
        public String title;
        public Long totalNum;
        public Long totalPoll;
        public Integer type;

        public Builder() {
        }

        public Builder(PollInfo pollInfo) {
            super(pollInfo);
            if (pollInfo == null) {
                return;
            }
            this.type = pollInfo.type;
            this.isMulti = pollInfo.isMulti;
            this.totalNum = pollInfo.totalNum;
            this.optionsCount = pollInfo.optionsCount;
            this.isPolled = pollInfo.isPolled;
            this.polledValue = pollInfo.polledValue;
            this.tips = pollInfo.tips;
            this.endTime = pollInfo.endTime;
            this.options = Message.copyOf(pollInfo.options);
            this.status = pollInfo.status;
            this.totalPoll = pollInfo.totalPoll;
            this.title = pollInfo.title;
            this.lastTime = pollInfo.lastTime;
        }

        @Override // com.squareup.wire.Message.Builder
        public PollInfo build(boolean z) {
            return new PollInfo(this, z);
        }
    }

    public PollInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            Integer num2 = builder.isMulti;
            if (num2 == null) {
                this.isMulti = DEFAULT_ISMULTI;
            } else {
                this.isMulti = num2;
            }
            Long l = builder.totalNum;
            if (l == null) {
                this.totalNum = DEFAULT_TOTALNUM;
            } else {
                this.totalNum = l;
            }
            Integer num3 = builder.optionsCount;
            if (num3 == null) {
                this.optionsCount = DEFAULT_OPTIONSCOUNT;
            } else {
                this.optionsCount = num3;
            }
            Integer num4 = builder.isPolled;
            if (num4 == null) {
                this.isPolled = DEFAULT_ISPOLLED;
            } else {
                this.isPolled = num4;
            }
            String str = builder.polledValue;
            if (str == null) {
                this.polledValue = "";
            } else {
                this.polledValue = str;
            }
            String str2 = builder.tips;
            if (str2 == null) {
                this.tips = "";
            } else {
                this.tips = str2;
            }
            Integer num5 = builder.endTime;
            if (num5 == null) {
                this.endTime = DEFAULT_ENDTIME;
            } else {
                this.endTime = num5;
            }
            List<PollOption> list = builder.options;
            if (list == null) {
                this.options = DEFAULT_OPTIONS;
            } else {
                this.options = Message.immutableCopyOf(list);
            }
            Integer num6 = builder.status;
            if (num6 == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num6;
            }
            Long l2 = builder.totalPoll;
            if (l2 == null) {
                this.totalPoll = DEFAULT_TOTALPOLL;
            } else {
                this.totalPoll = l2;
            }
            String str3 = builder.title;
            if (str3 == null) {
                this.title = "";
            } else {
                this.title = str3;
            }
            Integer num7 = builder.lastTime;
            if (num7 == null) {
                this.lastTime = DEFAULT_LASTTIME;
                return;
            } else {
                this.lastTime = num7;
                return;
            }
        }
        this.type = builder.type;
        this.isMulti = builder.isMulti;
        this.totalNum = builder.totalNum;
        this.optionsCount = builder.optionsCount;
        this.isPolled = builder.isPolled;
        this.polledValue = builder.polledValue;
        this.tips = builder.tips;
        this.endTime = builder.endTime;
        this.options = Message.immutableCopyOf(builder.options);
        this.status = builder.status;
        this.totalPoll = builder.totalPoll;
        this.title = builder.title;
        this.lastTime = builder.lastTime;
    }
}