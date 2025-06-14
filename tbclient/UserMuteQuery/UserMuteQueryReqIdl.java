package tbclient.UserMuteQuery;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class UserMuteQueryReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<UserMuteQueryReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(UserMuteQueryReqIdl userMuteQueryReqIdl) {
            super(userMuteQueryReqIdl);
            if (userMuteQueryReqIdl == null) {
                return;
            }
            this.data = userMuteQueryReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public UserMuteQueryReqIdl build(boolean z) {
            return new UserMuteQueryReqIdl(this, z);
        }
    }

    public UserMuteQueryReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}