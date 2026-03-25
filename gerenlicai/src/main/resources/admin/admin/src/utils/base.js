const base = {
    get() {
        return {
            url : "http://localhost:8080/gerenlicai/",
            name: "gerenlicai",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/gerenlicai/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "个人财务管理系统"
        } 
    }
}
export default base
