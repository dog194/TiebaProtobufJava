package tbclient.UserPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class UserPostReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<UserPostReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(UserPostReqIdl userPostReqIdl) {
            super(userPostReqIdl);
            if (userPostReqIdl == null) {
                return;
            }
            this.data = userPostReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public UserPostReqIdl build(boolean z) {
            return new UserPostReqIdl(this, z);
        }
    }

    public UserPostReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}