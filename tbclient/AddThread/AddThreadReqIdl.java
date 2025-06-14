package tbclient.AddThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class AddThreadReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<AddThreadReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(AddThreadReqIdl addThreadReqIdl) {
            super(addThreadReqIdl);
            if (addThreadReqIdl == null) {
                return;
            }
            this.data = addThreadReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public AddThreadReqIdl build(boolean z) {
            return new AddThreadReqIdl(this, z);
        }
    }

    public AddThreadReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}