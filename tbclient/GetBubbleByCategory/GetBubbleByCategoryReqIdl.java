package tbclient.GetBubbleByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GetBubbleByCategoryReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<GetBubbleByCategoryReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetBubbleByCategoryReqIdl getBubbleByCategoryReqIdl) {
            super(getBubbleByCategoryReqIdl);
            if (getBubbleByCategoryReqIdl == null) {
                return;
            }
            this.data = getBubbleByCategoryReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetBubbleByCategoryReqIdl build(boolean z) {
            return new GetBubbleByCategoryReqIdl(this, z);
        }
    }

    public GetBubbleByCategoryReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}