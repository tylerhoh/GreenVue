import { RouteRecordRaw } from 'vue-router';
import MainLayout from 'layouts/MainLayout.vue';
import ErrorNotFound from 'pages/ErrorNotFound.vue'


const routes: RouteRecordRaw[] = [
  {
    path: '/',
    component: () => MainLayout,
    children: [{ path: '', component: () => import('pages/IndexPage.vue') }],
  },

  // Always leave this as last one,
  // but you can also remove it
  {
    path: '/:catchAll(.*)*',
    component: () => ErrorNotFound,
  },
];

export default routes;
