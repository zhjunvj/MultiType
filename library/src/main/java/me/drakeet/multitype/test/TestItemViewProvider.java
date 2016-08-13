/*
 * Copyright 2016 drakeet. https://github.com/drakeet
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.drakeet.multitype.test;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import me.drakeet.multitype.ItemViewProvider;
import me.drakeet.multitype.TypeItem;

/**
 * @author drakeet
 */
public class TestItemViewProvider
    extends ItemViewProvider<TestItemContent, TestItemViewProvider.TestViewHolder> {

    @NonNull @Override
    protected TestViewHolder onCreateViewHolder(
        @NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        return null;
    }


    @Override
    protected void onBindViewHolder(
        @NonNull TestViewHolder holder,
        @NonNull TestItemContent testItemContent, @NonNull TypeItem typeItem) {
        // pass
    }


    public class TestViewHolder extends RecyclerView.ViewHolder {

        public TextView textView1;
        public TextView textView2;
        public TextView textView3;
        public TextView textView4;
        public TextView textView5;
        public TextView textView6;
        public TextView textView7;
        public TextView textView8;
        public TextView textView9;
        public TextView textView10;
        public TextView textView11;
        public TextView textView12;


        public TestViewHolder(View itemView) {
            super(itemView);
            textView1 = new TextView(itemView.getContext());
            textView2 = new TextView(itemView.getContext());
            textView3 = new TextView(itemView.getContext());
            textView4 = new TextView(itemView.getContext());
            textView5 = new TextView(itemView.getContext());
            textView6 = new TextView(itemView.getContext());
            textView7 = new TextView(itemView.getContext());
            textView8 = new TextView(itemView.getContext());
            textView9 = new TextView(itemView.getContext());
            textView10 = new TextView(itemView.getContext());
            textView11 = new TextView(itemView.getContext());
            textView12 = new TextView(itemView.getContext());
        }
    }
}
