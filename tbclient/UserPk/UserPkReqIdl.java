package tbclient.UserPk;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class UserPkReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<UserPkReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(UserPkReqIdl userPkReqIdl) {
            super(userPkReqIdl);
            if (userPkReqIdl == null) {
                return;
            }
            this.data = userPkReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public UserPkReqIdl build(boolean z) {
            return new UserPkReqIdl(this, z);
        }
    }

    public UserPkReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}