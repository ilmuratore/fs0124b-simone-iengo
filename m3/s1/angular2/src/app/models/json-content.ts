import { iPost } from "./iPost";


export interface ijsonContent {
  posts: iPost[];
  total:number;
  skip:number;
  limit:number;
}
