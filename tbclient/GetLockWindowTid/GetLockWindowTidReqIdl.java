package tbclient.GetLockWindowTid;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GetLockWindowTidReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<GetLockWindowTidReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetLockWindowTidReqIdl getLockWindowTidReqIdl) {
            super(getLockWindowTidReqIdl);
            if (getLockWindowTidReqIdl == null) {
                return;
            }
            this.data = getLockWindowTidReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetLockWindowTidReqIdl build(boolean z) {
            return new GetLockWindowTidReqIdl(this, z);
        }
    }

    public GetLockWindowTidReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}