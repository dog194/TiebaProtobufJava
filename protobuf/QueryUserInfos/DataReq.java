package protobuf.QueryUserInfos;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_REQUSERID = 0L;

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long reqUserId;

    public static final class Builder extends Message.Builder<DataReq> {
        public Long reqUserId;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.reqUserId = dataReq.reqUserId;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.reqUserId;
            if (l == null) {
                this.reqUserId = DEFAULT_REQUSERID;
                return;
            } else {
                this.reqUserId = l;
                return;
            }
        }
        this.reqUserId = builder.reqUserId;
    }
}