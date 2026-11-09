#tag Class
Protected Class MoveCombos

	#tag Property, Flags = &h0
		#tag Note
			A detail of moves this move can be used before or after, granting additional appeal points in contests.
		#tag EndNote
		normal As OpenAPIClient.Models.MoveComboUsage
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A detail of moves this move can be used before or after, granting additional appeal points in super contests.
		#tag EndNote
		Escapedsuper As OpenAPIClient.Models.MoveComboUsage
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
			Name="normal"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveComboUsage"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Escapedsuper"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveComboUsage"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


