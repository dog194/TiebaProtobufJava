package tbclient.DecryptCode;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class DecryptCodeReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<DecryptCodeReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(DecryptCodeReqIdl decryptCodeReqIdl) {
            super(decryptCodeReqIdl);
            if (decryptCodeReqIdl == null) {
                return;
            }
            this.data = decryptCodeReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public DecryptCodeReqIdl build(boolean z) {
            return new DecryptCodeReqIdl(this, z);
        }
    }

    public DecryptCodeReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}