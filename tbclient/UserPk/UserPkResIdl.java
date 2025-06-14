package tbclient.UserPk;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class UserPkResIdl extends Message {

    @ProtoField(tag = 1)
    public final DataRes data;

    @ProtoField(tag = 2)
    public final Error error;

    public static final class Builder extends Message.Builder<UserPkResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(UserPkResIdl userPkResIdl) {
            super(userPkResIdl);
            if (userPkResIdl == null) {
                return;
            }
            this.data = userPkResIdl.data;
            this.error = userPkResIdl.error;
        }

        @Override // com.squareup.wire.Message.Builder
        public UserPkResIdl build(boolean z) {
            return new UserPkResIdl(this, z);
        }
    }

    public UserPkResIdl(Builder builder, boolean z) {
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