package tbclient.PassFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class PassFriendReqIdl extends Message {

    @ProtoField(tag = 1)
    public final ReqData data;

    public static final class Builder extends Message.Builder<PassFriendReqIdl> {
        public ReqData data;

        public Builder() {
        }

        public Builder(PassFriendReqIdl passFriendReqIdl) {
            super(passFriendReqIdl);
            if (passFriendReqIdl == null) {
                return;
            }
            this.data = passFriendReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public PassFriendReqIdl build(boolean z) {
            return new PassFriendReqIdl(this, z);
        }
    }

    public PassFriendReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}