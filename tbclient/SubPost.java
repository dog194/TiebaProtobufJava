package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class SubPost extends Message {
    public static final Long DEFAULT_PID = 0L;
    public static final List<SubPostList> DEFAULT_SUB_POST_LIST = Collections.emptyList();

    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long pid;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<SubPostList> sub_post_list;

    public static final class Builder extends Message.Builder<SubPost> {
        public Long pid;
        public List<SubPostList> sub_post_list;

        public Builder() {
        }

        public Builder(SubPost subPost) {
            super(subPost);
            if (subPost == null) {
                return;
            }
            this.pid = subPost.pid;
            this.sub_post_list = Message.copyOf(subPost.sub_post_list);
        }

        @Override // com.squareup.wire.Message.Builder
        public SubPost build(boolean z) {
            return new SubPost(this, z);
        }
    }

    public SubPost(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.pid;
            if (l == null) {
                this.pid = DEFAULT_PID;
            } else {
                this.pid = l;
            }
            List<SubPostList> list = builder.sub_post_list;
            if (list == null) {
                this.sub_post_list = DEFAULT_SUB_POST_LIST;
                return;
            } else {
                this.sub_post_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.pid = builder.pid;
        this.sub_post_list = Message.immutableCopyOf(builder.sub_post_list);
    }
}