package tbclient.GetUserBlackInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetUserBlackInfoResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<GetUserBlackInfoResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetUserBlackInfoResIdl getUserBlackInfoResIdl) {
            super(getUserBlackInfoResIdl);
            if (getUserBlackInfoResIdl == null) {
                return;
            }
            this.error = getUserBlackInfoResIdl.error;
            this.data = getUserBlackInfoResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetUserBlackInfoResIdl build(boolean z) {
            return new GetUserBlackInfoResIdl(this, z);
        }
    }

    public GetUserBlackInfoResIdl(Builder builder, boolean z) {
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