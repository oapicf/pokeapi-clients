//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_learn_method_summary.g.dart';

/// MoveLearnMethodSummary
///
/// Properties:
/// * [name] 
/// * [url] 
@BuiltValue()
abstract class MoveLearnMethodSummary implements Built<MoveLearnMethodSummary, MoveLearnMethodSummaryBuilder> {
  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'url')
  String get url;

  MoveLearnMethodSummary._();

  factory MoveLearnMethodSummary([void updates(MoveLearnMethodSummaryBuilder b)]) = _$MoveLearnMethodSummary;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveLearnMethodSummaryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveLearnMethodSummary> get serializer => _$MoveLearnMethodSummarySerializer();
}

class _$MoveLearnMethodSummarySerializer implements PrimitiveSerializer<MoveLearnMethodSummary> {
  @override
  final Iterable<Type> types = const [MoveLearnMethodSummary, _$MoveLearnMethodSummary];

  @override
  final String wireName = r'MoveLearnMethodSummary';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveLearnMethodSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'url';
    yield serializers.serialize(
      object.url,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MoveLearnMethodSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveLearnMethodSummaryBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.url = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MoveLearnMethodSummary deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveLearnMethodSummaryBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

