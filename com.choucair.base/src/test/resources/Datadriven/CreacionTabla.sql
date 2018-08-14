create table gplilibra.mytmpcname as (
	select cnnoss,cncdti,cnname,cncdcc
	from visionr.cname
	where cnnoss like '000008%'
	fetch first 10 row only
	)
with data