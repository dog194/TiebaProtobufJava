package tbclient.Userlike;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class UserlikeResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<UserlikeResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(UserlikeResIdl userlikeResIdl) {
            super(userlikeResIdl);
            if (userlikeResIdl == null) {
                return;
            }
            this.error = userlikeResIdl.error;
            this.data = userlikeResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public UserlikeResIdl build(boolean z) {
            return new UserlikeResIdl(this, z);
        }
    }

    public UserlikeResIdl(Builder builder, boolean z) {
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