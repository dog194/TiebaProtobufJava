package protobuf.PushMessage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static final Long DEFAULT_PUSHTIME = 0L;

    @ProtoField(tag = 2)
    public final PushMsg msgs;

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long pushTime;

    public static final class Builder extends Message.Builder<DataRes> {
        public PushMsg msgs;
        public Long pushTime;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.pushTime = dataRes.pushTime;
            this.msgs = dataRes.msgs;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.pushTime;
            if (l == null) {
                this.pushTime = DEFAULT_PUSHTIME;
            } else {
                this.pushTime = l;
            }
            this.msgs = builder.msgs;
            return;
        }
        this.pushTime = builder.pushTime;
        this.msgs = builder.msgs;
    }
}