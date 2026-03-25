import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import jierujilu from '@/views/modules/jierujilu/list'
    import shouzhileixing from '@/views/modules/shouzhileixing/list'
    import xiaofeiyusuan from '@/views/modules/xiaofeiyusuan/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import shouru from '@/views/modules/shouru/list'
    import shengqianmiaozhao from '@/views/modules/shengqianmiaozhao/list'
    import guihaijilu from '@/views/modules/guihaijilu/list'
    import xiaofeidengji from '@/views/modules/xiaofeidengji/list'
    import xuexiaojianjie from '@/views/modules/xuexiaojianjie/list'
    import config from '@/views/modules/config/list'
    import zhichu from '@/views/modules/zhichu/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '新闻咨询',
        component: news
      }
      ,{
	path: '/jierujilu',
        name: '借入记录',
        component: jierujilu
      }
      ,{
	path: '/shouzhileixing',
        name: '收支类型',
        component: shouzhileixing
      }
      ,{
	path: '/xiaofeiyusuan',
        name: '消费预算',
        component: xiaofeiyusuan
      }
      ,{
	path: '/xuesheng',
        name: '用户',
        component: xuesheng
      }
      ,{
	path: '/shouru',
        name: '收入',
        component: shouru
      }
      ,{
	path: '/shengqianmiaozhao',
        name: '省钱妙招',
        component: shengqianmiaozhao
      }
      ,{
	path: '/guihaijilu',
        name: '归还记录',
        component: guihaijilu
      }
      ,{
	path: '/xiaofeidengji',
        name: '消费等级',
        component: xiaofeidengji
      }
      ,{
	path: '/xuexiaojianjie',
        name: '理财新闻',
        component: xuexiaojianjie
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/zhichu',
        name: '支出',
        component: zhichu
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
