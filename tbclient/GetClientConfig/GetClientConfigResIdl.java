package tbclient.GetClientConfig;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetClientConfigResIdl extends Message {

    @ProtoField(tag = 1)
    public final DataRes data;

    @ProtoField(tag = 2)
    public final Error error;

    public static final class Builder extends Message.Builder<GetClientConfigResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetClientConfigResIdl getClientConfigResIdl) {
            super(getClientConfigResIdl);
            if (getClientConfigResIdl == null) {
                return;
            }
            this.data = getClientConfigResIdl.data;
            this.error = getClientConfigResIdl.error;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetClientConfigResIdl build(boolean z) {
            return new GetClientConfigResIdl(this, z);
        }
    }

    public GetClientConfigResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
        } else {
            this.data = builder.data;
            this.error = builder.error;
        }
    }
}