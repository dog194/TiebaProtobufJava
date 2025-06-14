package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class PostInfoList extends Message {
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_ARTICLE_COVER = "";
    public static final String DEFAULT_CONTENT_THREAD = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_IP = "";
    public static final String DEFAULT_NAME_SHOW = "";
    public static final String DEFAULT_POST_TYPE = "";
    public static final String DEFAULT_PTYPE = "";
    public static final String DEFAULT_TARGET_SCHEME = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_USER_NAME = "";
    public static final String DEFAULT_USER_PORTRAIT = "";
    public static final String DEFAULT_WONDERFUL_POST_INFO = "";

    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String _abstract;

    @ProtoField(tag = 71)
    public final ThreadAblum ablum_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 15)
    public final List<Abstract> abstract_thread;

    @ProtoField(tag = 40)
    public final Agree agree;

    @ProtoField(tag = 37, type = Message.Datatype.INT32)
    public final Integer agree_num;

    @ProtoField(tag = 36)
    public final AlaLiveInfo ala_info;

    @ProtoField(tag = 24)
    public final AnchorInfo anchor_info;

    @ProtoField(tag = 48, type = Message.Datatype.STRING)
    public final String article_cover;

    @ProtoField(tag = 70, type = Message.Datatype.INT32)
    public final Integer audit_status;

    @ProtoField(tag = 50)
    public final BaijiahaoInfo baijiahao_info;

    @ProtoField(tag = 67)
    public final ChatPrivate chat_private;

    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<PostInfoContent> content;

    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String content_thread;

    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer create_time;

    @ProtoField(tag = 31)
    public final DealInfo deal_info;

    @ProtoField(tag = 72)
    public final ThreadDrawInfo draw_info;

    @ProtoField(tag = 65)
    public final EditInfo edit_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 49)
    public final List<PbContent> first_post_content;

    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long forum_id;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String forum_name;

    @ProtoField(tag = 33, type = Message.Datatype.INT32)
    public final Integer freq_num;

    @ProtoField(tag = 61, type = Message.Datatype.INT32)
    public final Integer good_types;

    @ProtoField(tag = 25, type = Message.Datatype.INT32)
    public final Integer hide_post;

    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String ip;

    @ProtoField(tag = 57, type = Message.Datatype.INT32)
    public final Integer is_author_view;

    @ProtoField(tag = 30, type = Message.Datatype.BOOL)
    public final Boolean is_deal;

    @ProtoField(tag = 59, type = Message.Datatype.INT32)
    public final Integer is_manager;

    @ProtoField(tag = 47, type = Message.Datatype.INT32)
    public final Integer is_ntitle;

    @ProtoField(tag = 60, type = Message.Datatype.INT32)
    public final Integer is_origin_manager;

    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer is_post_deleted;

    @ProtoField(tag = 41, type = Message.Datatype.INT32)
    public final Integer is_remain;

    @ProtoField(tag = 44, type = Message.Datatype.INT32)
    public final Integer is_share_thread;

    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer is_thread;

    @ProtoField(tag = 43, type = Message.Datatype.INT32)
    public final Integer is_view_year;

    @ProtoField(tag = 52)
    public final Item item;

    @ProtoField(label = Message.Label.REPEATED, tag = 53)
    public final List<HeadItem> item_star;

    @ProtoField(tag = 21)
    public final LbsInfo lbs_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 68)
    public final List<FeedKV> log_param;

    @ProtoField(label = Message.Label.REPEATED, tag = 16)
    public final List<Media> media;

    @ProtoField(label = Message.Label.REPEATED, tag = 32)
    public final List<MultipleForum> multiple_forum_list;

    @ProtoField(tag = 35, type = Message.Datatype.STRING)
    public final String name_show;

    @ProtoField(tag = 42)
    public final OriginThreadInfo origin_thread_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 55)
    public final List<PbGoodsInfo> pb_goods_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 54)
    public final List<PbLinkInfo> pb_link_info;

    @ProtoField(tag = 28)
    public final PollInfo poll_info;

    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long post_id;

    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String post_type;

    @ProtoField(label = Message.Label.REPEATED, tag = 56)
    public final List<PrivSets> priv_sets;

    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String ptype;

    @ProtoField(tag = 22)
    public final Quote quote;

    @ProtoField(tag = 17, type = Message.Datatype.UINT32)
    public final Integer reply_num;

    @ProtoField(label = Message.Label.REPEATED, tag = 46)
    public final List<PbContent> rich_abstract;

    @ProtoField(label = Message.Label.REPEATED, tag = 45)
    public final List<PbContent> rich_title;

    @ProtoField(tag = 69)
    public final ThreadScoreInfo score_info;

    @ProtoField(tag = 39, type = Message.Datatype.INT32)
    public final Integer share_num;

    @ProtoField(tag = 66, type = Message.Datatype.STRING)
    public final String target_scheme;

    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long thread_id;

    @ProtoField(tag = 26, type = Message.Datatype.UINT64)
    public final Long thread_type;

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String title;

    @ProtoField(tag = 62, type = Message.Datatype.INT32)
    public final Integer top_types;

    @ProtoField(tag = 27)
    public final ZhiBoInfoTW twzhibo_info;

    @ProtoField(tag = 18, type = Message.Datatype.INT64)
    public final Long user_id;

    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String user_name;

    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String user_portrait;

    @ProtoField(tag = 63)
    public final UserPostPerm user_post_perm;

    @ProtoField(tag = 34, type = Message.Datatype.UINT64)
    public final Long v_forum_id;

    @ProtoField(tag = 29)
    public final VideoInfo video_info;

    @ProtoField(tag = 38, type = Message.Datatype.INT32)
    public final Integer view_num;

    @ProtoField(label = Message.Label.REPEATED, tag = 23)
    public final List<Voice> voice_info;

    @ProtoField(tag = 64)
    public final VoiceRoom voice_room;

    @ProtoField(tag = 51, type = Message.Datatype.STRING)
    public final String wonderful_post_info;

    @ProtoField(tag = 58)
    public final WorksInfo works_info;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_POST_ID = 0L;
    public static final Integer DEFAULT_IS_THREAD = 0;
    public static final Integer DEFAULT_CREATE_TIME = 0;
    public static final List<PostInfoContent> DEFAULT_CONTENT = Collections.emptyList();
    public static final Integer DEFAULT_IS_POST_DELETED = 0;
    public static final List<Abstract> DEFAULT_ABSTRACT_THREAD = Collections.emptyList();
    public static final List<Media> DEFAULT_MEDIA = Collections.emptyList();
    public static final Integer DEFAULT_REPLY_NUM = 0;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final List<Voice> DEFAULT_VOICE_INFO = Collections.emptyList();
    public static final Integer DEFAULT_HIDE_POST = 0;
    public static final Long DEFAULT_THREAD_TYPE = 0L;
    public static final Boolean DEFAULT_IS_DEAL = Boolean.FALSE;
    public static final List<MultipleForum> DEFAULT_MULTIPLE_FORUM_LIST = Collections.emptyList();
    public static final Integer DEFAULT_FREQ_NUM = 0;
    public static final Long DEFAULT_V_FORUM_ID = 0L;
    public static final Integer DEFAULT_AGREE_NUM = 0;
    public static final Integer DEFAULT_VIEW_NUM = 0;
    public static final Integer DEFAULT_SHARE_NUM = 0;
    public static final Integer DEFAULT_IS_REMAIN = 0;
    public static final Integer DEFAULT_IS_VIEW_YEAR = 0;
    public static final Integer DEFAULT_IS_SHARE_THREAD = 0;
    public static final List<PbContent> DEFAULT_RICH_TITLE = Collections.emptyList();
    public static final List<PbContent> DEFAULT_RICH_ABSTRACT = Collections.emptyList();
    public static final Integer DEFAULT_IS_NTITLE = 0;
    public static final List<PbContent> DEFAULT_FIRST_POST_CONTENT = Collections.emptyList();
    public static final List<HeadItem> DEFAULT_ITEM_STAR = Collections.emptyList();
    public static final List<PbLinkInfo> DEFAULT_PB_LINK_INFO = Collections.emptyList();
    public static final List<PbGoodsInfo> DEFAULT_PB_GOODS_INFO = Collections.emptyList();
    public static final List<PrivSets> DEFAULT_PRIV_SETS = Collections.emptyList();
    public static final Integer DEFAULT_IS_AUTHOR_VIEW = 0;
    public static final Integer DEFAULT_IS_MANAGER = 0;
    public static final Integer DEFAULT_IS_ORIGIN_MANAGER = 0;
    public static final Integer DEFAULT_GOOD_TYPES = 0;
    public static final Integer DEFAULT_TOP_TYPES = 0;
    public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();
    public static final Integer DEFAULT_AUDIT_STATUS = 0;

    public static final class Builder extends Message.Builder<PostInfoList> {
        public String _abstract;
        public ThreadAblum ablum_info;
        public List<Abstract> abstract_thread;
        public Agree agree;
        public Integer agree_num;
        public AlaLiveInfo ala_info;
        public AnchorInfo anchor_info;
        public String article_cover;
        public Integer audit_status;
        public BaijiahaoInfo baijiahao_info;
        public ChatPrivate chat_private;
        public List<PostInfoContent> content;
        public String content_thread;
        public Integer create_time;
        public DealInfo deal_info;
        public ThreadDrawInfo draw_info;
        public EditInfo edit_info;
        public List<PbContent> first_post_content;
        public Long forum_id;
        public String forum_name;
        public Integer freq_num;
        public Integer good_types;
        public Integer hide_post;
        public String ip;
        public Integer is_author_view;
        public Boolean is_deal;
        public Integer is_manager;
        public Integer is_ntitle;
        public Integer is_origin_manager;
        public Integer is_post_deleted;
        public Integer is_remain;
        public Integer is_share_thread;
        public Integer is_thread;
        public Integer is_view_year;
        public Item item;
        public List<HeadItem> item_star;
        public LbsInfo lbs_info;
        public List<FeedKV> log_param;
        public List<Media> media;
        public List<MultipleForum> multiple_forum_list;
        public String name_show;
        public OriginThreadInfo origin_thread_info;
        public List<PbGoodsInfo> pb_goods_info;
        public List<PbLinkInfo> pb_link_info;
        public PollInfo poll_info;
        public Long post_id;
        public String post_type;
        public List<PrivSets> priv_sets;
        public String ptype;
        public Quote quote;
        public Integer reply_num;
        public List<PbContent> rich_abstract;
        public List<PbContent> rich_title;
        public ThreadScoreInfo score_info;
        public Integer share_num;
        public String target_scheme;
        public Long thread_id;
        public Long thread_type;
        public String title;
        public Integer top_types;
        public ZhiBoInfoTW twzhibo_info;
        public Long user_id;
        public String user_name;
        public String user_portrait;
        public UserPostPerm user_post_perm;
        public Long v_forum_id;
        public VideoInfo video_info;
        public Integer view_num;
        public List<Voice> voice_info;
        public VoiceRoom voice_room;
        public String wonderful_post_info;
        public WorksInfo works_info;

        public Builder() {
        }

        public Builder(PostInfoList postInfoList) {
            super(postInfoList);
            if (postInfoList == null) {
                return;
            }
            this.forum_id = postInfoList.forum_id;
            this.thread_id = postInfoList.thread_id;
            this.post_id = postInfoList.post_id;
            this.is_thread = postInfoList.is_thread;
            this.create_time = postInfoList.create_time;
            this.forum_name = postInfoList.forum_name;
            this.title = postInfoList.title;
            this.content = Message.copyOf(postInfoList.content);
            this.content_thread = postInfoList.content_thread;
            this.user_name = postInfoList.user_name;
            this.ip = postInfoList.ip;
            this.is_post_deleted = postInfoList.is_post_deleted;
            this.ptype = postInfoList.ptype;
            this._abstract = postInfoList._abstract;
            this.abstract_thread = Message.copyOf(postInfoList.abstract_thread);
            this.media = Message.copyOf(postInfoList.media);
            this.reply_num = postInfoList.reply_num;
            this.user_id = postInfoList.user_id;
            this.user_portrait = postInfoList.user_portrait;
            this.post_type = postInfoList.post_type;
            this.lbs_info = postInfoList.lbs_info;
            this.quote = postInfoList.quote;
            this.voice_info = Message.copyOf(postInfoList.voice_info);
            this.anchor_info = postInfoList.anchor_info;
            this.hide_post = postInfoList.hide_post;
            this.thread_type = postInfoList.thread_type;
            this.twzhibo_info = postInfoList.twzhibo_info;
            this.poll_info = postInfoList.poll_info;
            this.video_info = postInfoList.video_info;
            this.is_deal = postInfoList.is_deal;
            this.deal_info = postInfoList.deal_info;
            this.multiple_forum_list = Message.copyOf(postInfoList.multiple_forum_list);
            this.freq_num = postInfoList.freq_num;
            this.v_forum_id = postInfoList.v_forum_id;
            this.name_show = postInfoList.name_show;
            this.ala_info = postInfoList.ala_info;
            this.agree_num = postInfoList.agree_num;
            this.view_num = postInfoList.view_num;
            this.share_num = postInfoList.share_num;
            this.agree = postInfoList.agree;
            this.is_remain = postInfoList.is_remain;
            this.origin_thread_info = postInfoList.origin_thread_info;
            this.is_view_year = postInfoList.is_view_year;
            this.is_share_thread = postInfoList.is_share_thread;
            this.rich_title = Message.copyOf(postInfoList.rich_title);
            this.rich_abstract = Message.copyOf(postInfoList.rich_abstract);
            this.is_ntitle = postInfoList.is_ntitle;
            this.article_cover = postInfoList.article_cover;
            this.first_post_content = Message.copyOf(postInfoList.first_post_content);
            this.baijiahao_info = postInfoList.baijiahao_info;
            this.wonderful_post_info = postInfoList.wonderful_post_info;
            this.item = postInfoList.item;
            this.item_star = Message.copyOf(postInfoList.item_star);
            this.pb_link_info = Message.copyOf(postInfoList.pb_link_info);
            this.pb_goods_info = Message.copyOf(postInfoList.pb_goods_info);
            this.priv_sets = Message.copyOf(postInfoList.priv_sets);
            this.is_author_view = postInfoList.is_author_view;
            this.works_info = postInfoList.works_info;
            this.is_manager = postInfoList.is_manager;
            this.is_origin_manager = postInfoList.is_origin_manager;
            this.good_types = postInfoList.good_types;
            this.top_types = postInfoList.top_types;
            this.user_post_perm = postInfoList.user_post_perm;
            this.voice_room = postInfoList.voice_room;
            this.edit_info = postInfoList.edit_info;
            this.target_scheme = postInfoList.target_scheme;
            this.chat_private = postInfoList.chat_private;
            this.log_param = Message.copyOf(postInfoList.log_param);
            this.score_info = postInfoList.score_info;
            this.audit_status = postInfoList.audit_status;
            this.ablum_info = postInfoList.ablum_info;
            this.draw_info = postInfoList.draw_info;
        }

        @Override // com.squareup.wire.Message.Builder
        public PostInfoList build(boolean z) {
            return new PostInfoList(this, z);
        }
    }

    public PostInfoList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            Long l2 = builder.thread_id;
            if (l2 == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l2;
            }
            Long l3 = builder.post_id;
            if (l3 == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = l3;
            }
            Integer num = builder.is_thread;
            if (num == null) {
                this.is_thread = DEFAULT_IS_THREAD;
            } else {
                this.is_thread = num;
            }
            Integer num2 = builder.create_time;
            if (num2 == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = num2;
            }
            String str = builder.forum_name;
            if (str == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str;
            }
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
            } else {
                this.title = str2;
            }
            List<PostInfoContent> list = builder.content;
            if (list == null) {
                this.content = DEFAULT_CONTENT;
            } else {
                this.content = Message.immutableCopyOf(list);
            }
            String str3 = builder.content_thread;
            if (str3 == null) {
                this.content_thread = "";
            } else {
                this.content_thread = str3;
            }
            String str4 = builder.user_name;
            if (str4 == null) {
                this.user_name = "";
            } else {
                this.user_name = str4;
            }
            String str5 = builder.ip;
            if (str5 == null) {
                this.ip = "";
            } else {
                this.ip = str5;
            }
            Integer num3 = builder.is_post_deleted;
            if (num3 == null) {
                this.is_post_deleted = DEFAULT_IS_POST_DELETED;
            } else {
                this.is_post_deleted = num3;
            }
            String str6 = builder.ptype;
            if (str6 == null) {
                this.ptype = "";
            } else {
                this.ptype = str6;
            }
            String str7 = builder._abstract;
            if (str7 == null) {
                this._abstract = "";
            } else {
                this._abstract = str7;
            }
            List<Abstract> list2 = builder.abstract_thread;
            if (list2 == null) {
                this.abstract_thread = DEFAULT_ABSTRACT_THREAD;
            } else {
                this.abstract_thread = Message.immutableCopyOf(list2);
            }
            List<Media> list3 = builder.media;
            if (list3 == null) {
                this.media = DEFAULT_MEDIA;
            } else {
                this.media = Message.immutableCopyOf(list3);
            }
            Integer num4 = builder.reply_num;
            if (num4 == null) {
                this.reply_num = DEFAULT_REPLY_NUM;
            } else {
                this.reply_num = num4;
            }
            Long l4 = builder.user_id;
            if (l4 == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l4;
            }
            String str8 = builder.user_portrait;
            if (str8 == null) {
                this.user_portrait = "";
            } else {
                this.user_portrait = str8;
            }
            String str9 = builder.post_type;
            if (str9 == null) {
                this.post_type = "";
            } else {
                this.post_type = str9;
            }
            this.lbs_info = builder.lbs_info;
            this.quote = builder.quote;
            List<Voice> list4 = builder.voice_info;
            if (list4 == null) {
                this.voice_info = DEFAULT_VOICE_INFO;
            } else {
                this.voice_info = Message.immutableCopyOf(list4);
            }
            this.anchor_info = builder.anchor_info;
            Integer num5 = builder.hide_post;
            if (num5 == null) {
                this.hide_post = DEFAULT_HIDE_POST;
            } else {
                this.hide_post = num5;
            }
            Long l5 = builder.thread_type;
            if (l5 == null) {
                this.thread_type = DEFAULT_THREAD_TYPE;
            } else {
                this.thread_type = l5;
            }
            this.twzhibo_info = builder.twzhibo_info;
            this.poll_info = builder.poll_info;
            this.video_info = builder.video_info;
            Boolean bool = builder.is_deal;
            if (bool == null) {
                this.is_deal = DEFAULT_IS_DEAL;
            } else {
                this.is_deal = bool;
            }
            this.deal_info = builder.deal_info;
            List<MultipleForum> list5 = builder.multiple_forum_list;
            if (list5 == null) {
                this.multiple_forum_list = DEFAULT_MULTIPLE_FORUM_LIST;
            } else {
                this.multiple_forum_list = Message.immutableCopyOf(list5);
            }
            Integer num6 = builder.freq_num;
            if (num6 == null) {
                this.freq_num = DEFAULT_FREQ_NUM;
            } else {
                this.freq_num = num6;
            }
            Long l6 = builder.v_forum_id;
            if (l6 == null) {
                this.v_forum_id = DEFAULT_V_FORUM_ID;
            } else {
                this.v_forum_id = l6;
            }
            String str10 = builder.name_show;
            if (str10 == null) {
                this.name_show = "";
            } else {
                this.name_show = str10;
            }
            this.ala_info = builder.ala_info;
            Integer num7 = builder.agree_num;
            if (num7 == null) {
                this.agree_num = DEFAULT_AGREE_NUM;
            } else {
                this.agree_num = num7;
            }
            Integer num8 = builder.view_num;
            if (num8 == null) {
                this.view_num = DEFAULT_VIEW_NUM;
            } else {
                this.view_num = num8;
            }
            Integer num9 = builder.share_num;
            if (num9 == null) {
                this.share_num = DEFAULT_SHARE_NUM;
            } else {
                this.share_num = num9;
            }
            this.agree = builder.agree;
            Integer num10 = builder.is_remain;
            if (num10 == null) {
                this.is_remain = DEFAULT_IS_REMAIN;
            } else {
                this.is_remain = num10;
            }
            this.origin_thread_info = builder.origin_thread_info;
            Integer num11 = builder.is_view_year;
            if (num11 == null) {
                this.is_view_year = DEFAULT_IS_VIEW_YEAR;
            } else {
                this.is_view_year = num11;
            }
            Integer num12 = builder.is_share_thread;
            if (num12 == null) {
                this.is_share_thread = DEFAULT_IS_SHARE_THREAD;
            } else {
                this.is_share_thread = num12;
            }
            List<PbContent> list6 = builder.rich_title;
            if (list6 == null) {
                this.rich_title = DEFAULT_RICH_TITLE;
            } else {
                this.rich_title = Message.immutableCopyOf(list6);
            }
            List<PbContent> list7 = builder.rich_abstract;
            if (list7 == null) {
                this.rich_abstract = DEFAULT_RICH_ABSTRACT;
            } else {
                this.rich_abstract = Message.immutableCopyOf(list7);
            }
            Integer num13 = builder.is_ntitle;
            if (num13 == null) {
                this.is_ntitle = DEFAULT_IS_NTITLE;
            } else {
                this.is_ntitle = num13;
            }
            String str11 = builder.article_cover;
            if (str11 == null) {
                this.article_cover = "";
            } else {
                this.article_cover = str11;
            }
            List<PbContent> list8 = builder.first_post_content;
            if (list8 == null) {
                this.first_post_content = DEFAULT_FIRST_POST_CONTENT;
            } else {
                this.first_post_content = Message.immutableCopyOf(list8);
            }
            this.baijiahao_info = builder.baijiahao_info;
            String str12 = builder.wonderful_post_info;
            if (str12 == null) {
                this.wonderful_post_info = "";
            } else {
                this.wonderful_post_info = str12;
            }
            this.item = builder.item;
            List<HeadItem> list9 = builder.item_star;
            if (list9 == null) {
                this.item_star = DEFAULT_ITEM_STAR;
            } else {
                this.item_star = Message.immutableCopyOf(list9);
            }
            List<PbLinkInfo> list10 = builder.pb_link_info;
            if (list10 == null) {
                this.pb_link_info = DEFAULT_PB_LINK_INFO;
            } else {
                this.pb_link_info = Message.immutableCopyOf(list10);
            }
            List<PbGoodsInfo> list11 = builder.pb_goods_info;
            if (list11 == null) {
                this.pb_goods_info = DEFAULT_PB_GOODS_INFO;
            } else {
                this.pb_goods_info = Message.immutableCopyOf(list11);
            }
            List<PrivSets> list12 = builder.priv_sets;
            if (list12 == null) {
                this.priv_sets = DEFAULT_PRIV_SETS;
            } else {
                this.priv_sets = Message.immutableCopyOf(list12);
            }
            Integer num14 = builder.is_author_view;
            if (num14 == null) {
                this.is_author_view = DEFAULT_IS_AUTHOR_VIEW;
            } else {
                this.is_author_view = num14;
            }
            this.works_info = builder.works_info;
            Integer num15 = builder.is_manager;
            if (num15 == null) {
                this.is_manager = DEFAULT_IS_MANAGER;
            } else {
                this.is_manager = num15;
            }
            Integer num16 = builder.is_origin_manager;
            if (num16 == null) {
                this.is_origin_manager = DEFAULT_IS_ORIGIN_MANAGER;
            } else {
                this.is_origin_manager = num16;
            }
            Integer num17 = builder.good_types;
            if (num17 == null) {
                this.good_types = DEFAULT_GOOD_TYPES;
            } else {
                this.good_types = num17;
            }
            Integer num18 = builder.top_types;
            if (num18 == null) {
                this.top_types = DEFAULT_TOP_TYPES;
            } else {
                this.top_types = num18;
            }
            this.user_post_perm = builder.user_post_perm;
            this.voice_room = builder.voice_room;
            this.edit_info = builder.edit_info;
            String str13 = builder.target_scheme;
            if (str13 == null) {
                this.target_scheme = "";
            } else {
                this.target_scheme = str13;
            }
            this.chat_private = builder.chat_private;
            List<FeedKV> list13 = builder.log_param;
            if (list13 == null) {
                this.log_param = DEFAULT_LOG_PARAM;
            } else {
                this.log_param = Message.immutableCopyOf(list13);
            }
            this.score_info = builder.score_info;
            Integer num19 = builder.audit_status;
            if (num19 == null) {
                this.audit_status = DEFAULT_AUDIT_STATUS;
            } else {
                this.audit_status = num19;
            }
            this.ablum_info = builder.ablum_info;
            this.draw_info = builder.draw_info;
            return;
        }
        this.forum_id = builder.forum_id;
        this.thread_id = builder.thread_id;
        this.post_id = builder.post_id;
        this.is_thread = builder.is_thread;
        this.create_time = builder.create_time;
        this.forum_name = builder.forum_name;
        this.title = builder.title;
        this.content = Message.immutableCopyOf(builder.content);
        this.content_thread = builder.content_thread;
        this.user_name = builder.user_name;
        this.ip = builder.ip;
        this.is_post_deleted = builder.is_post_deleted;
        this.ptype = builder.ptype;
        this._abstract = builder._abstract;
        this.abstract_thread = Message.immutableCopyOf(builder.abstract_thread);
        this.media = Message.immutableCopyOf(builder.media);
        this.reply_num = builder.reply_num;
        this.user_id = builder.user_id;
        this.user_portrait = builder.user_portrait;
        this.post_type = builder.post_type;
        this.lbs_info = builder.lbs_info;
        this.quote = builder.quote;
        this.voice_info = Message.immutableCopyOf(builder.voice_info);
        this.anchor_info = builder.anchor_info;
        this.hide_post = builder.hide_post;
        this.thread_type = builder.thread_type;
        this.twzhibo_info = builder.twzhibo_info;
        this.poll_info = builder.poll_info;
        this.video_info = builder.video_info;
        this.is_deal = builder.is_deal;
        this.deal_info = builder.deal_info;
        this.multiple_forum_list = Message.immutableCopyOf(builder.multiple_forum_list);
        this.freq_num = builder.freq_num;
        this.v_forum_id = builder.v_forum_id;
        this.name_show = builder.name_show;
        this.ala_info = builder.ala_info;
        this.agree_num = builder.agree_num;
        this.view_num = builder.view_num;
        this.share_num = builder.share_num;
        this.agree = builder.agree;
        this.is_remain = builder.is_remain;
        this.origin_thread_info = builder.origin_thread_info;
        this.is_view_year = builder.is_view_year;
        this.is_share_thread = builder.is_share_thread;
        this.rich_title = Message.immutableCopyOf(builder.rich_title);
        this.rich_abstract = Message.immutableCopyOf(builder.rich_abstract);
        this.is_ntitle = builder.is_ntitle;
        this.article_cover = builder.article_cover;
        this.first_post_content = Message.immutableCopyOf(builder.first_post_content);
        this.baijiahao_info = builder.baijiahao_info;
        this.wonderful_post_info = builder.wonderful_post_info;
        this.item = builder.item;
        this.item_star = Message.immutableCopyOf(builder.item_star);
        this.pb_link_info = Message.immutableCopyOf(builder.pb_link_info);
        this.pb_goods_info = Message.immutableCopyOf(builder.pb_goods_info);
        this.priv_sets = Message.immutableCopyOf(builder.priv_sets);
        this.is_author_view = builder.is_author_view;
        this.works_info = builder.works_info;
        this.is_manager = builder.is_manager;
        this.is_origin_manager = builder.is_origin_manager;
        this.good_types = builder.good_types;
        this.top_types = builder.top_types;
        this.user_post_perm = builder.user_post_perm;
        this.voice_room = builder.voice_room;
        this.edit_info = builder.edit_info;
        this.target_scheme = builder.target_scheme;
        this.chat_private = builder.chat_private;
        this.log_param = Message.immutableCopyOf(builder.log_param);
        this.score_info = builder.score_info;
        this.audit_status = builder.audit_status;
        this.ablum_info = builder.ablum_info;
        this.draw_info = builder.draw_info;
    }
}