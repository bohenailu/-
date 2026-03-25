
var projectName = '个人财务管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
]


var indexNav = [

{
	name: '理财新闻',
	url: './pages/xuexiaojianjie/list.html'
}, 
{
	name: '省钱妙招',
	url: './pages/shengqianmiaozhao/list.html'
}, 

{
	name: '新闻咨询',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/gerenlicai/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"理财新闻","menuJump":"列表","tableName":"xuexiaojianjie"}],"menu":"理财新闻管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"省钱妙招","menuJump":"列表","tableName":"shengqianmiaozhao"}],"menu":"省钱妙招管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"xuesheng"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"收支类型","menuJump":"列表","tableName":"shouzhileixing"}],"menu":"收支类型管理"},{"child":[{"buttons":["查看","删除"],"menu":"收入","menuJump":"列表","tableName":"shouru"}],"menu":"收入管理"},{"child":[{"buttons":["查看","删除"],"menu":"支出","menuJump":"列表","tableName":"zhichu"}],"menu":"支出管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"消费等级","menuJump":"列表","tableName":"xiaofeidengji"}],"menu":"消费等级管理"},{"child":[{"buttons":["查看","删除"],"menu":"消费预算","menuJump":"列表","tableName":"xiaofeiyusuan"}],"menu":"消费预算管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"新闻咨询","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"理财新闻列表","menuJump":"列表","tableName":"xuexiaojianjie"}],"menu":"理财新闻模块"},{"child":[{"buttons":["查看"],"menu":"省钱妙招列表","menuJump":"列表","tableName":"shengqianmiaozhao"}],"menu":"省钱妙招模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","报表"],"menu":"收入","menuJump":"列表","tableName":"shouru"}],"menu":"收入管理"},{"child":[{"buttons":["新增","查看","修改","删除","报表"],"menu":"支出","menuJump":"列表","tableName":"zhichu"}],"menu":"支出管理"},{"child":[{"buttons":["查看"],"menu":"消费等级","menuJump":"列表","tableName":"xiaofeidengji"}],"menu":"消费等级管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"消费预算","menuJump":"列表","tableName":"xiaofeiyusuan"}],"menu":"消费预算管理"},{"child":[{"buttons":["新增","查看","修改","删除","归还"],"menu":"借入记录","menuJump":"列表","tableName":"jierujilu"}],"menu":"借入记录管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"归还记录","menuJump":"列表","tableName":"guihaijilu"}],"menu":"归还记录管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"理财新闻列表","menuJump":"列表","tableName":"xuexiaojianjie"}],"menu":"理财新闻模块"},{"child":[{"buttons":["查看"],"menu":"省钱妙招列表","menuJump":"列表","tableName":"shengqianmiaozhao"}],"menu":"省钱妙招模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"xuesheng"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
