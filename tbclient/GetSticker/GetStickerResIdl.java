package tbclient.GetSticker;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetStickerResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<GetStickerResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetStickerResIdl getStickerResIdl) {
            super(getStickerResIdl);
            if (getStickerResIdl == null) {
                return;
            }
            this.error = getStickerResIdl.error;
            this.data = getStickerResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetStickerResIdl build(boolean z) {
            return new GetStickerResIdl(this, z);
        }
    }

    public GetStickerResIdl(Builder builder, boolean z) {
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