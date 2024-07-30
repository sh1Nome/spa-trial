import { createRouter, createWebHistory } from 'vue-router'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/hoge',
      name: 'hoge',
      component: () => import('../views/HogeView.vue')
    },
    {
      path: '/fuga',
      name: 'fuga',
      component: () => import('../views/FugaView.vue')
    },
    {
      path: '/piyo',
      name: 'piyo',
      component: () => import('../views/PiyoView.vue')
    },
  ]
})

export default router
