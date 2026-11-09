#tag Class
Protected Class NatureBattleStylePreference

	#tag Property, Flags = &h0
		#tag Note
			Chance of using the move, in percent, if HP is under one half.
		#tag EndNote
		low_hp_preference As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Chance of using the move, in percent, if HP is over one half.
		#tag EndNote
		high_hp_preference As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The move battle style.
		#tag EndNote
		move_battle_style As OpenAPIClient.Models.MoveBattleStyleSummary
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="low_hp_preference"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="high_hp_preference"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="move_battle_style"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveBattleStyleSummary"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


