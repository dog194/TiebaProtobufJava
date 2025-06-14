package tbclient.AddFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class AddFriendReqIdl extends Message {

    @ProtoField(tag = 1)
    public final ReqData data;

    public static final class Builder extends Message.Builder<AddFriendReqIdl> {
        public ReqData data;

        public Builder() {
        }

        public Builder(AddFriendReqIdl addFriendReqIdl) {
            super(addFriendReqIdl);
            if (addFriendReqIdl == null) {
                return;
            }
            this.data = addFriendReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public AddFriendReqIdl build(boolean z) {
            return new AddFriendReqIdl(this, z);
        }
    }

    public AddFriendReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}