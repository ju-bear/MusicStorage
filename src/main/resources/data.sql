INSERT INTO GENRE VALUES('40dc1da04e5d4674836464b363dc69a7', 'Some genre')
INSERT INTO GENRE VALUES('8cd7c3c94dab400291c6479c887c9ddb', 'Some other genre')
INSERT INTO AUTHOR VALUES('16e73f938d194c8ea9d7e6785d0f19a7', CURRENT_DATE(), 'Russia', 'Ivan', 'Ivanov', 'jd', 'Ivanovich', '40dc1da04e5d4674836464b363dc69a7')

INSERT INTO ALBUM VALUES('8de45288335b468aaec1128ed3e9b0ae', CURRENT_DATE(), 'Some title', '40dc1da04e5d4674836464b363dc69a7')

INSERT INTO MUSIC_TRACK VALUES('7f508e2eae4946ad99df6a84cbfc7cde', CURRENT_DATE(), 10000, 'Some-track', '8de45288335b468aaec1128ed3e9b0ae', '16e73f938d194c8ea9d7e6785d0f19a7')