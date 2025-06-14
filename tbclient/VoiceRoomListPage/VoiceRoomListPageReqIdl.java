package tbclient.VoiceRoomListPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class VoiceRoomListPageReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<VoiceRoomListPageReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(VoiceRoomListPageReqIdl voiceRoomListPageReqIdl) {
            super(voiceRoomListPageReqIdl);
            if (voiceRoomListPageReqIdl == null) {
                return;
            }
            this.data = voiceRoomListPageReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public VoiceRoomListPageReqIdl build(boolean z) {
            return new VoiceRoomListPageReqIdl(this, z);
        }
    }

    public VoiceRoomListPageReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}