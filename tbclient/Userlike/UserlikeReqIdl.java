package tbclient.Userlike;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class UserlikeReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<UserlikeReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(UserlikeReqIdl userlikeReqIdl) {
            super(userlikeReqIdl);
            if (userlikeReqIdl == null) {
                return;
            }
            this.data = userlikeReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public UserlikeReqIdl build(boolean z) {
            return new UserlikeReqIdl(this, z);
        }
    }

    public UserlikeReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}