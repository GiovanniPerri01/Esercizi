import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { N7bPage } from './n7b.page';

const routes: Routes = [
  {
    path: '',
    component: N7bPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class N7bPageRoutingModule {}
