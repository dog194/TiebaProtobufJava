package tbclient.GetLockWindowMsg;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetLockWindowMsgResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<GetLockWindowMsgResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetLockWindowMsgResIdl getLockWindowMsgResIdl) {
            super(getLockWindowMsgResIdl);
            if (getLockWindowMsgResIdl == null) {
                return;
            }
            this.error = getLockWindowMsgResIdl.error;
            this.data = getLockWindowMsgResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetLockWindowMsgResIdl build(boolean z) {
            return new GetLockWindowMsgResIdl(this, z);
        }
    }

    public GetLockWindowMsgResIdl(Builder builder, boolean z) {
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