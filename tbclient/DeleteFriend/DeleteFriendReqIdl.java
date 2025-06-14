package tbclient.DeleteFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class DeleteFriendReqIdl extends Message {

    @ProtoField(tag = 1)
    public final ReqData data;

    public static final class Builder extends Message.Builder<DeleteFriendReqIdl> {
        public ReqData data;

        public Builder() {
        }

        public Builder(DeleteFriendReqIdl deleteFriendReqIdl) {
            super(deleteFriendReqIdl);
            if (deleteFriendReqIdl == null) {
                return;
            }
            this.data = deleteFriendReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public DeleteFriendReqIdl build(boolean z) {
            return new DeleteFriendReqIdl(this, z);
        }
    }

    public DeleteFriendReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}