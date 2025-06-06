package protobuf.GetGroupMsg;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import protobuf.Error;

/* loaded from: classes4.dex */
public final class GetGroupMsgResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<GetGroupMsgResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetGroupMsgResIdl getGroupMsgResIdl) {
            super(getGroupMsgResIdl);
            if (getGroupMsgResIdl == null) {
                return;
            }
            this.error = getGroupMsgResIdl.error;
            this.data = getGroupMsgResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetGroupMsgResIdl build(boolean z) {
            return new GetGroupMsgResIdl(this, z);
        }
    }

    public GetGroupMsgResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
        } else {
            this.error = builder.error;
            this.data = builder.data;
        }
    }
}