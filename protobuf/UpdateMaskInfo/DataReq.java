package protobuf.UpdateMaskInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_LIST = "";

    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer call_from;

    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long g_id;

    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer isMask;

    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer is_mute_notifications;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String list;

    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer type;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_ISMASK = 0;
    public static final Long DEFAULT_G_ID = 0L;
    public static final Integer DEFAULT_CALL_FROM = 0;
    public static final Integer DEFAULT_IS_MUTE_NOTIFICATIONS = 0;

    public static final class Builder extends Message.Builder<DataReq> {
        public Integer call_from;
        public Long g_id;
        public Integer isMask;
        public Integer is_mute_notifications;
        public String list;
        public Integer type;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.type = dataReq.type;
            this.isMask = dataReq.isMask;
            this.list = dataReq.list;
            this.g_id = dataReq.g_id;
            this.call_from = dataReq.call_from;
            this.is_mute_notifications = dataReq.is_mute_notifications;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            Integer num2 = builder.isMask;
            if (num2 == null) {
                this.isMask = DEFAULT_ISMASK;
            } else {
                this.isMask = num2;
            }
            String str = builder.list;
            if (str == null) {
                this.list = "";
            } else {
                this.list = str;
            }
            Long l = builder.g_id;
            if (l == null) {
                this.g_id = DEFAULT_G_ID;
            } else {
                this.g_id = l;
            }
            Integer num3 = builder.call_from;
            if (num3 == null) {
                this.call_from = DEFAULT_CALL_FROM;
            } else {
                this.call_from = num3;
            }
            Integer num4 = builder.is_mute_notifications;
            if (num4 == null) {
                this.is_mute_notifications = DEFAULT_IS_MUTE_NOTIFICATIONS;
                return;
            } else {
                this.is_mute_notifications = num4;
                return;
            }
        }
        this.type = builder.type;
        this.isMask = builder.isMask;
        this.list = builder.list;
        this.g_id = builder.g_id;
        this.call_from = builder.call_from;
        this.is_mute_notifications = builder.is_mute_notifications;
    }
}