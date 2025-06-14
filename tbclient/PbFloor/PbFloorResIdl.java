package tbclient.PbFloor;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class PbFloorResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<PbFloorResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(PbFloorResIdl pbFloorResIdl) {
            super(pbFloorResIdl);
            if (pbFloorResIdl == null) {
                return;
            }
            this.error = pbFloorResIdl.error;
            this.data = pbFloorResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public PbFloorResIdl build(boolean z) {
            return new PbFloorResIdl(this, z);
        }
    }

    public PbFloorResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
        } else {
            this.error = builder.error;
            this.data = builder.data;
        }
    }
}